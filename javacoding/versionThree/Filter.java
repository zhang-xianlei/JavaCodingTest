package javacoding.versionThree;

import java.io.FilenameFilter;
import java.io.File;

public class Filter implements FilenameFilter{
    String extent;
    Filter(String extent){
        this.extent = extent;
    }

    @Override
    public boolean accept(File dir, String name){
        return name.endsWith("." + extent);
    }
}
