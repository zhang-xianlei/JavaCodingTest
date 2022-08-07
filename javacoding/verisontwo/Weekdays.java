package javacoding.verisontwo;

public enum Weekdays {
  MONDAY("星期一", 0), TUESDAY("星期二", 1), WEDENSDAY("星期三", 2), THURSDAY("星期四", 3), FRIDAY("星期五", 4);

  private String name;
  private int index;
  public static int sum = 9999;

  private static int staticVar = 100;
  public int buga = 99990;

  private Weekdays(String name, int index) {
    this.name = name;
    this.index = index;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append('-');
    sb.append(index);
    return sb.toString();
  }

  public String getInfo() {
    return super.toString();
  }

  public static int getStaticVar() {
    return staticVar;
  }

}
