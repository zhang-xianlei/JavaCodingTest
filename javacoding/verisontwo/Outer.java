package javacoding.verisontwo;

public class Outer {
  private int x = 10;

  private void print() {
    System.out.println("outer function");
  }

  public void test() {
    Inner inner = new Inner();
    inner.display();
  }

  class Inner {
    private int x = 5;

    private void print() {
      System.out.println("inner function");
    }

    void display() {
      System.out.println("outer variable x = " + Outer.this.x);
      System.out.println("innter variable x = " + this.x);
      System.out.println("innter variable x = " + x);
      Outer.this.print();
      print();
    }
  }

  private int value = 10;

  // Local internal class
  public void add(final int x, int y) {
    int z = 100;
    class AddInner {
      void display() {
        int sum = x + z + y + value;
        System.out.println("sum = " + sum);
      }
    }
    new AddInner().display();
  }
}
