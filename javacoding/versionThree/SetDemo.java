package javacoding.versionThree;

import java.util.HashSet;
import java.util.Iterator;
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
        System.out.println("--use for each iterator--");
        for(Object item: set){
            String a = (String) item;
            System.out.println("read the item " + a);
        }
        System.out.println("-- use the iterator to --");
        Iterator it = set.iterator();
        while(it.hasNext()){
            Object item = it.next();
            String s = (String) item;
            System.out.println("reat the item in Iterator " + s);
        }
        System.out.println("-- use the forEach to torverse the set");
        set.forEach(item -> {
            System.out.println("read the iterator by forEach: " + item);
        });
        set.clear();
        System.out.println(set);
        
    }
}
