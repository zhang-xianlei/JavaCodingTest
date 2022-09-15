package javacoding.versionThree;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamTransfer {
    public static void main(String[] args){
        try(
            FileInputStream fis = new FileInputStream("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/page/index.html");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bis = new BufferedReader(isr);
            FileOutputStream fos = new FileOutputStream("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/page/indexCopy.html");
            OutputStreamWriter ost = new OutputStreamWriter(fos, "GBK");
            BufferedWriter bos = new BufferedWriter(ost);
        ){
            String line = bis.readLine();
            while(line != null){
                bos.write(line);
                bos.newLine();
                line = bis.readLine();
            }
            System.out.println("copy done");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    
}
