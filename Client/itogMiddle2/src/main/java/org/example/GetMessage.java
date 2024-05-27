package org.example;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class GetMessage extends Thread {
    Scanner scanner = new Scanner(System.in);
    BufferedReader in;
    public GetMessage(BufferedReader bufferedReader){
        this.in = bufferedReader;
    }

    @Override
    public void run() {

        while (true){
            try {
                sleep(1);
                getMessage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void getMessage() throws Exception{
        System.out.println("Пришло от сервера - "+in.readLine());
    }
}
