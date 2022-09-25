package com.sungrowCharger;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) {
        System.out.println("client is running...");
        try (
                Socket socket = new Socket("127.0.0.1", 8080);
                BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
                FileInputStream fin = new FileInputStream(
                        "/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/testDir/redPanda.jpeg");
                BufferedInputStream in = new BufferedInputStream(fin)) {
            byte[] buffer = new byte[1024];
            int len = in.read(buffer);
            while (len != -1) {
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
            System.out.println("Upload success");
        } catch (ConnectException e) {
            System.out.println("server client is not running");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
