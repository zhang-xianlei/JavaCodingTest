package javacoding.versionThree;

public class HelloWorld {
  public static Calculable calculate(char opr) {
    Calculable result;
    /*
     * if (opr == '+') {
     * result = new Calculable() {
     * 
     * @Override
     * public int calculateInt(int a, int b) {
     * return a + b;
     * }
     * };
     * } else {
     * result = new Calculable() {
     * 
     * @Override
     * public int calculateInt(int a, int b) {
     * return a - b;
     * }
     * };
     * }
     */
    // if (opr == '+') {
    // result = (int a, int b) -> {
    // return a + b;
    // };
    // } else {
    // result = (int a, int b) -> {
    // return a - b;
    // };
    // }
    if (opr == '+') {
      result = (a, b) -> a + b;
    } else {
      result = (a, b) -> a - b;
    }
    return result;
  }

  public static void display(Calculable calc, int n1, int n2) {
    System.out.println(calc.calculateInt(n1, n2));
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 5;
    // display((a, b) -> a + b, x, y);
    // display((a, b) -> a - b, x, y);
    LambdaDemo demo = new LambdaDemo();
    System.out.println(demo.sub());

    LambdaDemo ld = new LambdaDemo();
    display(ld::subB, x, y);
    display(LambdaDemo::addB, x, y);
    // lambda
    /*
     * int n1 = 10;
     * int n2 = 20;
     * Calculable f1 = calculate('+');
     * Calculable f2 = calculate('-');
     * System.out.printf("%d + %d = %d \n", n1, n2, f1.calculateInt(n1, n2));
     * System.out.printf("%d - %d = %d \n", n1, n2, f2.calculateInt(n1, n2));
     */
  }
}
