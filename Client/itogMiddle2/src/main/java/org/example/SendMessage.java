package org.example;

import java.io.PrintWriter;
import java.util.Scanner;

public class SendMessage extends Thread {
    PrintWriter out;
    Scanner scanner = new Scanner(System.in);

    public SendMessage(PrintWriter printWriter){
        this.out = printWriter;
    }

    @Override
    public void run() {

        while (true){
            try {
                sleep(1);
                sendMessage();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void sendMessage(){
        String send = scanner.nextLine();
        out.println(send);

    }

}
