package javacoding.versionThree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileWithReaderWriter {
    public static void main(String[] args){
        try(FileReader in = new FileReader("/Users/Leo/dev/transferAABTOApk/SunCharge.aab");
        FileWriter out = new FileWriter("/Users/Leo/dev/transferAABTOApk/SunChargeCopyB.aab")){
            long startTime = System.nanoTime();
            char[] buffer = new char[1024];
            int len = in.read(buffer);
            while(len != -1){
                // String copyStr = new String(buffer);
                // System.out.println(copyStr);
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("It is wasted " + (elapsedTime / 1000000) + "ms"); //It is wasted88997ms 1747   
            // buffer = char[10] 2238ms
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
