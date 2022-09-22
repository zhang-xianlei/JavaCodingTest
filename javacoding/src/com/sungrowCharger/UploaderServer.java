package javacoding.src.com.sungrowCharger;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploaderServer {
    public static void main(String[] args){
        System.out.println("server client is running ...");
        try(
            ServerSocket server = new ServerSocket(8080);
            Socket socket = server.accept();
            BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
            FileOutputStream out = new FileOutputStream("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/testDir/redPanda_bak.jpeg")
        ){
            byte[] buffer = new byte[1024];
            int len = in.read(buffer);
            while(len != -1){
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
            System.out.println("accept finished");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
