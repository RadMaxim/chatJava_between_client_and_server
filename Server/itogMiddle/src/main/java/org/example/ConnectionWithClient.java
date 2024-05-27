package org.example;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ConnectionWithClient {
    public static ArrayList<Socket> connectionClients(ServerSocket server) throws Exception{
        ArrayList<Socket>clients = new ArrayList<>();
        while (clients.size()<1){
            System.out.println("Ожидаем подключение...");
            clients.add(server.accept());
            System.out.println("Подключение произошло пользователя с ip: "+clients.get(0).getInetAddress());
        }
        return clients;
    }
}
