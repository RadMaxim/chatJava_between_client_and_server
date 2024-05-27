package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class CreateClient {
    PrintWriter out;
    BufferedReader in;
    public CreateClient(String ip, int port) throws Exception {
        Socket socket = new Socket(ip,port);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        SendMessage sendMessage = new SendMessage(out);
        sendMessage.start();
        GetMessage getMessage = new GetMessage(in);
        getMessage.start();
    }
}
