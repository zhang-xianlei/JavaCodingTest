package javacoding.src.com.sungrowCharger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpChatServer {
  public static void main(String[] args) {
    System.out.println("chat server is running...");
    Thread t1 = new Thread(() -> {
      try (
          DatagramSocket socket = new DatagramSocket(8080);
          BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in))) {
        System.out.println("socket port is " + socket.getPort());
        while (true) {
          // received data
          byte[] buffer = new byte[128];
          DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
          int len = packet.getLength();
          String str = new String(buffer, 0, len);
          System.out.printf("data received from client [%s] \n", str);
          // send data from server
          InetAddress address = packet.getAddress();
          int port = packet.getPort();
          String keyboardInputString = keyboardIn.readLine();
          byte[] b = keyboardInputString.getBytes();
          packet = new DatagramPacket(b, b.length, address, port);
          socket.send(packet);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    t1.start();
  }
}
