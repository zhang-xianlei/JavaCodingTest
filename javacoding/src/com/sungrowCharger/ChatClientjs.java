package com.sungrowCharger;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;

import org.json.JSONObject;

public class ChatClientjs {
    public static void main(String[] args){
        System.out.println("Client is running...");
        Thread t = new Thread(() -> {
            try(
                Socket socket = new Socket("127.0.0.1", 8080);
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in))
            ){
                while(true){
                    String keyboardInputString = keyboardIn.readLine();
                    if(keyboardInputString.equals("bye")){
                        break;
                    }
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("message", keyboardInputString);
                    jsonObject.put("userId", "abcd");
                    jsonObject.put("userName", "zxl");
                    out.writeUTF(jsonObject.toString());
                    out.flush();
                    //receive message
                    String str = in.readUTF();
                    jsonObject = new JSONObject(str);
                    System.out.printf("message from server: %s \n", str);
                }
            }catch(ConnectException e){
                System.out.println("server did not response");
            }catch(Exception e){}
            System.out.println("client is over");
        });
        t.start();
        
    }
}
