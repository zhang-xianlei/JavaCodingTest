package org.json;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Downloader {
  private static String urlString = "https://gimg2.baidu.com/"
      + "image_search/src=http%3A%2F%2Fp1.itc.cn%2Fimages01%2F20210401%2Fac71deb481c1438ea3a7f8e51522a9a4.jpeg"
      + "&refer=http%3A%2F%2Fp1.itc.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?"
      + "sec=1667291491&t=ea114c162b9b1c9df60f8b43548ea053";

  public static void main(String[] args) {
    download();
  }

  private static void download() {
    HttpURLConnection conn = null;
    try {
      URL reqUrl = new URL(urlString);
      conn = (HttpURLConnection) reqUrl.openConnection();
      try (
          InputStream is = conn.getInputStream();
          BufferedInputStream bin = new BufferedInputStream(is);
          OutputStream os = new FileOutputStream(
              "/Users/suncharger/vsProjects/JavaCodingTest/javacoding/testDir/fuxi.jpeg");
          BufferedOutputStream bout = new BufferedOutputStream(os);) {
        byte[] buffer = new byte[1024];
        int bytesRead = bin.read(buffer);
        System.out.println("buffer value is: " + buffer);
        while (bytesRead != -1) {
          bout.write(buffer, 0, bytesRead);
          bytesRead = bin.read(buffer);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println("finish downloading");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (conn != null) {
        conn.disconnect();
      }
    }
  }
}
