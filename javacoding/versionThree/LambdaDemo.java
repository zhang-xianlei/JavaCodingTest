package javacoding.versionThree;

public class LambdaDemo {
  private int value = 10;
  private static int staticValue = 5;

  public static Calculable add() {
    int localValue = 30;
    Calculable result = (int a, int b) -> {
      staticValue++;
      return a + b + staticValue + localValue;
    };
    return result;
  }

  public Calculable sub() {
    Calculable result = (int a, int b) -> {
      staticValue++;
      return a - b - value - staticValue;
    };
    return result;
  }

  public static int addB(int a, int b) {
    return a + b;
  }

  public int subB(int a, int b) {
    return a - b;
  }
}
