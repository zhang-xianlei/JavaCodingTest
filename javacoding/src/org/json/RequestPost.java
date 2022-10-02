package org.json;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class RequestPost {
  static String urlString = "http://localhost:8080/NoteWebService/note.do";

  public static void main(String[] args) {
    BufferedReader br = null;
    HttpURLConnection conn = null;
    try {
      URL reqURL = new URL(urlString);
      conn = (HttpURLConnection) reqURL.openConnection();
      conn.setRequestMethod("POST");
      conn.setDoOutput(true);
      String params = String.format("ID = %s & action = %s", "10", "query");

      DataOutputStream dStream = new DataOutputStream(conn.getOutputStream());
      dStream.writeBytes(params);
      dStream.close();

      // InputStream is = conn.getInputStream();
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
