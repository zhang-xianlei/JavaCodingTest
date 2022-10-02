package org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestGet {
  static String urlString = "http://localhost:8080/NoteWebService/note.do?action=query&ID=10";

  public static void main(String[] args) {
    BufferedReader br = null;
    HttpURLConnection conn = null;
    try {
      URL reqURL = new URL(urlString);
      conn = (HttpURLConnection) reqURL.openConnection();
      conn.setRequestMethod("GET");
      InputStream is = conn.getInputStream();
      InputStreamReader isr = new InputStreamReader(is, "utf-8");
      br = new BufferedReader(isr);
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();
      while (line != null) {
        sb.append(line);
        line = br.readLine();
      }
      System.out.println(sb);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (conn != null) {
        conn.disconnect();
      }
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
