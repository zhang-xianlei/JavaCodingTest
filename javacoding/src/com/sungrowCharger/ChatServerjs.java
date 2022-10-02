package com.sungrowCharger;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import org.json.JSONObject;

public class ChatServerjs {
    public static void main(String[] args){
        System.out.println("server is running");
        Thread t = new Thread(() -> {
            try (
                ServerSocket server = new ServerSocket(8080);
                Socket socket = server.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in))){
                while(true){
                    String str = in.readUTF();
                    JSONObject jsonObject = new JSONObject(str);
                    System.out.printf("get data from client %s \n", jsonObject);
                    String keyboardInputString = keyboardIn.readLine();
                    if(keyboardInputString.equals("bye")){
                        break;
                    }
                    jsonObject = new JSONObject();
                    jsonObject.put("message", keyboardInputString);
                    jsonObject.put("userId", "abcd");
                    jsonObject.put("userName", "Tom");
                    out.writeUTF(jsonObject.toString());
                    out.flush();
                }
            } catch(Exception e){
            }
            System.out.println("server is end");
        });
        t.start();
    }
    
}
