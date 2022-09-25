package com.sungrowCharger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpChatClient {
  public static void main(String[] args) {
    System.out.println("client is running...");
    Thread t2 = new Thread(() -> {
      try (
          DatagramSocket socket = new DatagramSocket();
          BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in))) {
        while (true) {
          System.out.println("udp port is " + socket.getPort());
          // send message
          byte[] buffer = new byte[128];
          InetAddress address = InetAddress.getByName("localhost");
          int port = 8080;
          String keyboardInputString = keyboardIn.readLine();
          if (keyboardInputString.equals("bye")) {
            break;
          }
          byte[] b = keyboardInputString.getBytes();
          DatagramPacket packet = new DatagramPacket(b, b.length, address, port);
          socket.send(packet);
          // receive message
          packet = new DatagramPacket(buffer, buffer.length);
          socket.receive(packet);
          int len = packet.getLength();
          String str = new String(buffer, 0, len);
          System.out.printf("message received from server [%S] \n", str);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    t2.start();
  }

}
