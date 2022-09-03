package javacoding.versionThree;

import java.util.ArrayList;
import java.util.List;

public class ListQueue<T> implements IQueue<T> {
  private List<T> items;

  public ListQueue() {
    this.items = new ArrayList<T>();
  }

  @Override
  public void queue(T item) {
    this.items.add(item);
  }

  @Override
  public T dequeue() {
    if (this.items.isEmpty()) {
      return null;
    } else {
      return this.items.remove(0);
    }
  }

  @Override
  public String toString() {
    return items.toString();
  }

  // public static <T extends Number> boolean isEquals(T a, T b) {
  public static <T> boolean isEquals(T a, T b) {
    return a.equals(b);
  }
}
