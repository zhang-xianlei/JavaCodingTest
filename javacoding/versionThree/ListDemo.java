package javacoding.versionThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List list = new ArrayList();
    String b = "B";
    list.add("A");
    list.add(b);
    list.add("C");
    list.add(b);
    list.add("D");
    list.add("E");
    System.out.println("list len = " + list.size());
    System.out.println(list);
    System.out.println("indexOf(\"B\")= " + list.indexOf("B"));
    System.out.println("lastIndexOf(\"B\")= " + list.lastIndexOf("B"));
    list.remove(b);
    System.out.println("before removing 3 : " + list);
    System.out.println("contain \"B\" is really? " + list.contains(b));
    list.remove(3);
    System.out.println("after removing 3 : " + list);
    list.set(1, "F");
    System.out.println("after setting 1 \"F\" : " + list);
    // list.clear();
    System.out.println("list is empty " + list.isEmpty());
    list.add("1");
    list.add("3");
    // int item = (Integer) list.get(0);
    // System.out.println(item);
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("list item of list(%d) : $s\n", i, (String) list.get(i));
    }
    for (Object item : list) {
      String s = (String) item;
      System.out.println("item: " + s);
    }
    Iterator it = list.iterator();
    while (it.hasNext()) {
      Object item = it.next();
      String s = (String) item;
      System.out.println("Iteratore item show: " + s);
    }
    list.forEach(item -> {
      System.out.println("read list item: " + item);
    });

  }
}
