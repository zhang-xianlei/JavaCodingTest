package com.sungrowCharger;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpUploadClient {
  public static void main(String[] args) {
    try (
        DatagramSocket socket = new DatagramSocket();
        FileInputStream fin = new FileInputStream(
            "/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/redPanda.jpeg");
        BufferedInputStream in = new BufferedInputStream(fin)) {
      InetAddress address = InetAddress.getByName("localhost");
      byte[] buffer = new byte[1024];
      int len = in.read(buffer);
      while (len != -1) {
        DatagramPacket packet = new DatagramPacket(buffer, len, address, 8080);
        socket.send(packet);
        len = in.read(buffer);
      }
      DatagramPacket packet = new DatagramPacket("overB".getBytes(), 3, address, 8080);
      socket.send(packet);
      System.out.println("upload over all");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
