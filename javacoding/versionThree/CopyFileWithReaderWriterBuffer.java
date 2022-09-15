package javacoding.versionThree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileWithReaderWriterBuffer {
    public static void main(String[] args){
        // try(FileReader in = new FileReader("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/page/index.html");
        try(FileReader in = new FileReader("/Users/Leo/dev/transferAABTOApk/SunCharge.aab");
        BufferedReader bis = new BufferedReader(in);
        // FileWriter out = new FileWriter("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/page/indexCopy.html");
        FileWriter out = new FileWriter("/Users/Leo/dev/transferAABTOApk/SunChargeBuffer.aab");
        BufferedWriter bos = new BufferedWriter(out)){
            long startTime = System.nanoTime();
            String line = bis.readLine();
            while(line != null){
                // String copyStr = new String(line);
                // System.out.println(copyStr);
                // System.out.println("division line is here");
                bos.write(line);
                bos.newLine();
                line = bis.readLine();
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
