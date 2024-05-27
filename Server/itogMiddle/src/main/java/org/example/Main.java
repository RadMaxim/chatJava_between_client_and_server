package org.example;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5555);
        ArrayList<Socket> clients = ConnectionWithClient.connectionClients(server);
        WorkerServer.workServer(clients);
        WorkerServer.getMessage(clients);

    }
}