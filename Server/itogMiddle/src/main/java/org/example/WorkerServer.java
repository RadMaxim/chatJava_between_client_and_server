package org.example;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkerServer {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out;
    static BufferedReader in;

    public WorkerServer() {
    }

    public static void workServer(ArrayList<Socket> clients){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    out = new PrintWriter(clients.get(0).getOutputStream(),true);
                    while (true){
                            Thread.sleep(1);
                            String send = scanner.nextLine();
                            out.println(send);

                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();
    }
    public static void getMessage(ArrayList<Socket> clients){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        in = new BufferedReader(new InputStreamReader(clients.get(0).getInputStream()));
                        Thread.sleep(1);
                        String send = in.readLine();
                        if (send!=null){
                            System.out.println("Сообщение от клиента: "+ send);
                            SaveData.saveData(send,clients.get(0).getInetAddress().toString());
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }).start();
    }
}
