package javacoding.versionThree;

import java.io.File;
public class FileDemo {
    public static void main(String[] args){
        File dir = new File("/Users/Leo/dev/JavaCoding/JavaCodingTest/javacoding/page");
        Filter filter = new Filter("html");
        System.out.println("Html file menu: " + dir);
        String files[] = dir.list(filter);
        System.out.println(files.toString());
        for(String fileName : files){
            File f = new File(dir, fileName);
            if(f.isFile()){
                System.out.println("file name: " +  f.getName());
                System.out.println("file absolute path: " + f.getAbsolutePath());
                System.out.println("file path: " + f.getPath());
            } else {
                System.out.println("child path" + f);
            }
        }
    }
}
