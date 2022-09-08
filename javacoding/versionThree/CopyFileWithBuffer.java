package javacoding.versionThree;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithBuffer {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("/Users/Leo/dev/transferAABTOApk/SunCharge.aab");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("/Users/Leo/dev/transferAABTOApk/SunChargeCopyBuffer.aab");
        BufferedOutputStream bos = new BufferedOutputStream(fos)){
            long startTime = System.nanoTime();
            byte[] buffer = new byte[1024];
            int len = bis.read(buffer);
            while(len != -1){
                System.out.println("len is what: " + len);
                bos.write(buffer, 0, len);
                len = bis.read(buffer);
                System.out.println("after write len is what: " + len);
            }
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("wast time with buffer: " + elapsedTime / 1000000  + 'S'); // 95687 S

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    } 
}
