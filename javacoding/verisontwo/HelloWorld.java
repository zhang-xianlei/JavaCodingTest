package javacoding.verisontwo;

public class HelloWorld {
  public static void main(String[] args) {

    String intExample = "ABC";
    String intExampleD = "def";
    int intExampleB = Integer.parseInt(intExample, 16);
    int intExampleE = Integer.parseInt(intExampleD, 16);
    System.out.println(intExampleB);
    System.out.println(intExampleE);
    Person p1 = new Person("Tony", 20);
    Person p2 = new Person("Lily", 23);
    System.out.println(p1.toString());
    System.out.println(p1.equals(p2));
    // 枚举类的构造方法
    /*
     * Weekdays[] allValues = Weekdays.values();
     * for (Weekdays value : allValues) {
     * System.out.printf("%d - %s\n", value.ordinal(), value);
     * }
     * 
     * Weekdays day1 = Weekdays.FRIDAY;
     * Weekdays day2 = Weekdays.valueOf("FRIDAY");
     * 
     * System.out.println(day1.ordinal());
     * System.out.println(day2);
     * System.out.println(day1 instanceof Weekdays);
     * System.out.println(day1 == Weekdays.FRIDAY);
     * System.out.println(day1.equals(Weekdays.FRIDAY));
     * System.out.println(day1 == day2);
     */
    // 枚举变量和成员方法及构造方法
    /*
     * Weekdays day = Weekdays.FRIDAY;
     * switch (day) {
     * case MONDAY:
     * System.out.println("周一");
     * break;
     * case TUESDAY:
     * System.out.println("周二");
     * break;
     * case WEDENSDAY:
     * System.out.println("周三");
     * break;
     * case THURSDAY:
     * System.out.println("周四");
     * break;
     * case FRIDAY:
     * System.out.println("周五");
     * break;
     * default:
     * System.out.println("周末");
     * }
     * System.out.println(day);
     * System.out.println(day.getInfo());
     * System.out.println(Weekdays.getStaticVar());
     * System.out.println(Weekdays.sum);
     * System.out.println(day.buga);
     */
  }

}
