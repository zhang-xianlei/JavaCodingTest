package com.sungrowCharger;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        System.out.println("Client is running");
        Thread t = new Thread(() -> {
            try (
                    Socket socket = new Socket("127.0.0.1", 8080);
                    DataInputStream in = new DataInputStream(socket.getInputStream());
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    String keyboardInputString = keyboardIn.readLine();
                    if (keyboardInputString.equals("bye")) {
                        break;
                    }
                    out.writeUTF(keyboardInputString);
                    out.flush();
                    String str = in.readUTF();
                    System.out.printf("message accepted from server %s \n", str);
                }

            } catch (ConnectException e) {
                System.out.println("Server is not running");
            } catch (Exception e) {
            }
            System.out.println("client is stoped");
        });

        t.start();
    }

}
