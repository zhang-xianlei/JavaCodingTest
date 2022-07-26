package javacoding.versionone;

public class FinalDemo {
  void doSomething() {
    final int e;
    e = 100;
    System.out.println(e);
    final int f = 200;
  }

  final int a = 5;
  final int b;
  final static int c = 12;
  final static int d;
  static {
    d = 32;
  }

  FinalDemo() {
    b = 3;
  }

}
