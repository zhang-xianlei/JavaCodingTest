package javacoding.versionone;

class SubFinalDemo extends FinalDemo {
  @Override
  void doSomething() {
    System.out.println(1000);
  }

  public static void main(String[] args) {
    FinalDemo p = new FinalDemo();

    p.doSomething();
    System.out.println(p.d);

  }
}
