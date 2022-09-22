package javacoding.src.com.sungrowCharger;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args){
        System.out.println("sever is running ...");
        Thread t = new Thread(() -> {
            try(
                ServerSocket server = new ServerSocket(8080);
                Socket socket = server.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in))){
                    while(true){
                        String str = in.readUTF();
                        System.out.printf("Message accepted from client:  %s\n", str);
                        String keyboardInpuString = keyboardIn.readLine();
                        if(keyboardInpuString.equals("bye")){
                            break;
                        }
                        out.writeUTF(keyboardInpuString);
                        out.flush();
                    }
            }catch(Exception e){

            }
            System.out.println("Server is ending");
        });
        t.start();
    }
    
}
