package javacoding.src.com.sungrowCharger;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpUploadServer {
  public static void main(String[] args) {
    System.out.println("Server is start from here......");
    Thread t = new Thread(() -> {
      try (
          DatagramSocket socket = new DatagramSocket(8080);
          FileOutputStream fout = new FileOutputStream(
              "/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/redPanda_D.jpeg");
          BufferedOutputStream out = new BufferedOutputStream(fout)) {
        byte[] buffer = new byte[1024];
        while (true) {
          DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
          socket.receive(packet);
          int len = packet.getLength();
          if (len == 5) {
            String flag = new String(buffer, 0, 3);
            if (flag.equals("overB")) {
              break;
            }
          }
          out.write(buffer, 0, len);
        }
        System.out.println("received all over");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    t.start();
  }
}
