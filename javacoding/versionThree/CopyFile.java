package javacoding.versionThree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String [] args){
        try(FileInputStream in = new FileInputStream("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/page/home.html");
        FileOutputStream out = new FileOutputStream("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/page/newHome.html")){
            byte[] buffer = new byte[1000];
            int len = in.read(buffer);
            while(len != -1){
                String copyStr = new String(buffer);
                System.out.println(copyStr);
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
