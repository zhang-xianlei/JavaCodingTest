package javacoding.versionThree;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
  private List<T> items;

  public GenericClass() {
    this.items = new ArrayList<T>();
  }

  public void queue(T item) {
    this.items.add(item);
  }

  public T dequeue() {
    if (items.isEmpty()) {
      return null;
    } else {
      return this.items.remove(0);
    }
  }

  @Override
  public String toString() {
    return items.toString();
  }
}

class TestGenericClass {
  public static void main(String[] args) {
    GenericClass<String> genericClass = new GenericClass<String>();
    genericClass.queue("A");
    genericClass.queue("B");
    genericClass.queue("C");
    genericClass.queue("D");
    genericClass.queue("E");
    // genericClass.queue(12);
    System.out.println(genericClass);
    genericClass.dequeue();
    System.out.println(genericClass);
  }
}