package javacoding.versionThree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String [] args){
        try(FileInputStream in = new FileInputStream("/Users/Leo/dev/transferAABTOApk/SunCharge.aab");
        FileOutputStream out = new FileOutputStream("/Users/Leo/dev/transferAABTOApk/SunChargeCopy.aab")){
            long startTime = System.nanoTime();
            byte[] buffer = new byte[1024];
            int len = in.read(buffer);
            while(len != -1){
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("need time: " + elapsedTime / 1000000.0 + " S"); 
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
