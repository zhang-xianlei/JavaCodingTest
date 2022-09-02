package javacoding.versionThree;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// import java.util.ArrayList;
// import java.util.Date;
// import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        /*
         * List <String> list = new ArrayList<>();
         * list.add("1");
         * list.add("2");
         * list.add("3");
         * list.add("4");
         * list.add("5");
         * list.add("6");
         * list.add("7");
         * list.add("8");
         * // list.add(new Date());
         * for(Object item : list){
         * // Integer element = (Integer) item;
         * System.out.println("element = " + item);
         * }
         */
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println("read item " + item);
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Tom");
        map.put(3, "July");
        Set<Integer> keys = map.keySet();
        for (Object item : keys) {
            String value = map.get(item);
            System.out.printf("people name %s ,its serialNum is %d\n", value, item);
        }
        Collection<String> values = map.values();
        Iterator<String> itB = values.iterator();
        while (itB.hasNext()) {
            String item = itB.next();
            System.out.println("map collection: " + item);
        }
    }
}
