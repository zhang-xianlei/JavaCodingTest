package javacoding.versionThree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HandleError {
  public static void main(String[] args) {
    // Date date = readDate();
    // System.out.println("read time = " + date);
    try {
      try {
        int i;
        int j = 0;
        i = 1 / j;
      } catch (Exception e) {
        System.out.print("1");
        throw e;
      } finally {
        System.out.print("2");
      }
    } catch (Exception e) {
      System.out.print("3");
    } finally {
      System.out.printf("4\n");
    }
  }

  public static Date readDate() {

    try (FileInputStream readFile = new FileInputStream("./readme.md");
        InputStreamReader ir = new InputStreamReader(readFile);
        BufferedReader in = new BufferedReader(ir)) {

      String str = in.readLine();
      if (str == null) {
        return null;
      }
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      Date date = df.parse(str);
      return date;
    } catch (FileNotFoundException e) {
      System.out.println("manage fileNotFoundException");
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("manage iOException");
      e.printStackTrace();
    } catch (ParseException e) {
      System.out.println("manage parseException");
      e.printStackTrace();
    }
    return null;
  }
  /*
   * FileInputStream readFile = null;
   * InputStreamReader ir = null;
   * BufferedReader in = null;
   * try {
   * readFile = new FileInputStream("./readme.md");
   * ir = new InputStreamReader(readFile);
   * in = new BufferedReader(ir);
   * String str = in.readLine();
   * if (str == null) {
   * return null;
   * }
   * DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
   * Date date = df.parse(str);
   * return date;
   * } catch (FileNotFoundException e) {
   * System.out.println("manage fileNotFoundException");
   * e.printStackTrace();
   * } catch (IOException e) {
   * System.out.println("manage iOException");
   * e.printStackTrace();
   * } catch (ParseException e) {
   * System.out.println("manage parseException");
   * e.printStackTrace();
   * } finally {
   * try {
   * if (readFile != null) {
   * readFile.close();
   * }
   * } catch (IOException e) {
   * e.printStackTrace();
   * }
   * try {
   * if (ir != null) {
   * ir.close();
   * }
   * } catch (IOException e) {
   * e.printStackTrace();
   * }
   * try {
   * if (in != null) {
   * in.close();
   * }
   * } catch (IOException e) {
   * e.printStackTrace();
   * }
   * }
   * return null;
   * }
   */

}
