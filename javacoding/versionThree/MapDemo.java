package javacoding.versionThree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args){
        Map map = new HashMap();
        map.put(102, "zhangSan");
        map.put(105, "liSi");
        map.put(109, "Lily");
        map.put(110, "Tom");
        map.put(111, "liSi");
        map.put(109, "July");
        // System.out.println(map);
        // System.out.println("the size of map is " + map.size());
        // System.out.println("109-" + map.get(109));
        // map.remove(109);
        // System.out.println("109-" + map.get(109));
        // System.out.println("109-" + map.containsValue("Tom"));
        // System.out.println("the map is empty " + map.isEmpty());
        // map.clear();
        // System.out.println("the map is empty " + map.isEmpty());
        Set keys = map.keySet();
        for(Object key: keys){
            int iKey = (Integer) key;
            String value = (String) map.get(iKey);
            System.out.printf("key = %d - value = %s \nCo", iKey, value);
        }
        Collection values = map.values();
        Iterator it = values.iterator();
        while(it.hasNext()){
            Object item = it.next();
            String s = (String) item;
            System.out.println("the value of map :" + s);
        }

        map.forEach((k, v) -> {
            System.out.printf("map key is %s - map value is %s \n", k, v);
        });
    }

}
