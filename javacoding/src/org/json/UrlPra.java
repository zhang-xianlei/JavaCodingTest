package org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlPra {
  public static void main(String[] args) {
    String url = "https://www.sohu.com/";
    URL reqUrl;
    try {
      reqUrl = new URL(url);
    } catch (MalformedURLException el) {
      return;
    }
    try (
        InputStream is = reqUrl.openStream();
        InputStreamReader isr = new InputStreamReader(is, "utf-8");
        BufferedReader br = new BufferedReader(isr)) {
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();
      while (line != null) {
        sb.append(line);
        sb.append("\n");
      }
      System.out.println(sb);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
