package javacoding.verisontwo;

public enum Weekdays {
  MONDAY, TUESDAY, WEDENSDAY, THURSDAY, FRIDAY;

  private String name = "zxl";
  private int index = 199;
  public static int sum = 9999;

  private static int staticVar = 100;
  public int buga = 99990;

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
