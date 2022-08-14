package javacoding.verisontwo;

public class View {
  private int x = 20;

  private static int staticX = 30;

  static class Button {
    void onClick() {
      System.out.println(staticX);
    }
  }

}
