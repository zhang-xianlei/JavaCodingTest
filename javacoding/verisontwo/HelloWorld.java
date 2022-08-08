package javacoding.verisontwo;

public class HelloWorld {
  public static void main(String[] args) {
    // 构造方法
    Integer objInt = Integer.valueOf(80);
    Double objDouble = Double.valueOf(80.0);
    Float objFloat = Float.valueOf("80.0");
    Long objLong = Long.valueOf("80");
    // Number 类方法
    long longVar = objInt.longValue();
    int intVar = objDouble.intValue();
    System.out.println("intVar = " + intVar);
    System.out.println("longVar = " + longVar);
    // compareTo 方法
    Float objFloat2 = Float.valueOf(100);
    int result = objFloat.compareTo(objFloat2);
    System.out.println(result);

    // 字符串转化成基本数据类型
    int intVar2 = Integer.parseInt("100");
    int intVar3 = Integer.parseInt("ABC", 16);
    System.out.println("intVar2 = " + intVar2);
    System.out.println("intVar3 = " + intVar3);

    // 基本数据类型转化成字符串
    String str1 = Integer.toString(100, 2);
    String str2 = Double.toString(100.00);
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);

    // 包装类
    /*
     * String intExample = "ABC";
     * String intExampleD = "def";
     * int intExampleB = Integer.parseInt(intExample, 16);
     * int intExampleE = Integer.parseInt(intExampleD, 16);
     * String stringInt = Integer.toString(1101010, 16);
     * System.out.println(intExampleB);
     * System.out.println(intExampleE);
     * System.out.println(stringInt);
     * Person p1 = new Person("Tony", 20);
     * Person p2 = new Person("Lily", 23);
     * System.out.println(p1.toString());
     * System.out.println(p1.equals(p2));
     */
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
