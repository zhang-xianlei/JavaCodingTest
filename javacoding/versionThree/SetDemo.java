package javacoding.versionThree;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args){
        Set set = new HashSet();
        String b = "B";
        set.add("A");
        set.add(b);
        set.add("C");
        set.add(b);
        set.add("D");
        set.add("E");
        System.out.println(" set size = " + set.size());
        System.out.println(set);
        set.remove(b);
        System.out.println("set include \"B\":" + set.contains(b));
        System.out.println("set is empty ? " + set.isEmpty());
        set.clear();
        System.out.println(set);
    }
}
