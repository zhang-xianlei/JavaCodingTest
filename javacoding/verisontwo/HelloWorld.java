package javacoding.verisontwo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HelloWorld {
  public static int display(Integer objInt) {
    System.out.println(objInt);
    return objInt;
  }

  public static void displayB(double n) {
    System.out.printf("ceil(%.1f) = %.1f\n", n, Math.ceil(n));
    System.out.printf("floor(%.1f) = %.1f\n", n, Math.floor(n));
    System.out.printf("round(%.1f) = %d\n", n, Math.round(n));
    System.out.println();
  }

  public static void main(String[] args) {
    // BigDecimal
    /*
     * BigDecimal num1 = new BigDecimal("999999999.99888888");
     * BigDecimal num2 = new BigDecimal(56780000.88888888);
     * System.out.println("add handler: " + num1.add(num2));
     * System.out.println("subtract handler: " + num1.subtract(num2));
     * System.out.println("multiply handler: " + num1.multiply(num2));
     * // System.out.println("divide handler: " + num1.divide(num2));
     * System.out.println("divide handler: " + num1.divide(num2,
     * BigDecimal.ROUND_HALF_UP));
     */
    // BigInteger
    /*
     * BigInteger num1 = new BigInteger("9999999999");
     * BigInteger num2 = new BigInteger("5678999", 16);
     * System.out.println("add handler: " + num1.add(num2));
     * System.out.println("subtract handler: " + num1.subtract(num2));
     * System.out.println("multiply handler: " + num1.multiply(num2));
     * System.out.println("divide handler: " + num1.divide(num2));
     */

    // System.out.println(display(1000));
    // float fB = 4f;
    // double dA = 3.333333;
    // System.out.printf("%8.3f\n", fB);
    // System.out.printf("%.3f\n", dA);
    // Math 类
    /*
     * double[] nums = { 1.4, 1.5, 1.6 };
     * System.out.printf("min(%.1f, %.1f) = %.1f\n", nums[1], nums[2],
     * Math.min(nums[1], nums[2]));
     * System.out.printf("max(%.1f, %.1f) = %.1f\n", nums[1], nums[2],
     * Math.max(nums[1], nums[2]));
     * System.out.println();
     * System.out.printf("toDegrees(0.5π) = %f\n", Math.toDegrees(0.5 * Math.PI));
     * System.out.printf("toRadians(180/π) = %f\n", Math.toRadians(180 / Math.PI));
     * System.out.println();
     * System.out.printf("sqrt(%.1f) = %f\n", nums[2], Math.sqrt(nums[2]));
     * System.out.println();
     * System.out.printf("pow(8, 3) = %f\n", Math.pow(8, 3));
     * System.out.println();
     * System.out.printf("0.0 ~ 1.0的随机数 = %f\n", Math.random());
     * System.out.println();
     * for (double num : nums) {
     * displayB(num);
     * }
     */

    // Boolean 类
    /*
     * Boolean obj1 = Boolean.valueOf(true);
     * Boolean obj2 = Boolean.valueOf("true");
     * Boolean obj3 = Boolean.valueOf(false);
     * Boolean obj4 = Boolean.valueOf("yes");
     * System.out.println(obj1);
     * System.out.println(obj2);
     * System.out.println(obj3);
     * System.out.println(obj4);
     * int result = obj1.compareTo(obj4);
     * System.out.println(result);
     */

    // Character 类
    /*
     * Character objChar1 = Character.valueOf('A');
     * char ch = objChar1.charValue();
     * Character objChar2 = Character.valueOf('c');
     * int resultB = objChar1.compareTo(objChar2);
     * if (resultB < 0) {
     * System.out.println("objChar1 小于 objChar2");
     * }
     * System.out.println(ch);
     */
    /*
     * // 构造方法
     * Integer objInt = Integer.valueOf(80);
     * Double objDouble = Double.valueOf(80.0);
     * Float objFloat = Float.valueOf("80.0");
     * Long objLong = Long.valueOf("80");
     * // Number 类方法
     * long longVar = objInt.longValue();
     * int intVar = objDouble.intValue();
     * System.out.println("intVar = " + intVar);
     * System.out.println("longVar = " + longVar);
     * // compareTo 方法
     * Float objFloat2 = Float.valueOf(100);
     * int result = objFloat.compareTo(objFloat2);
     * System.out.println(result);
     * 
     * // 字符串转化成基本数据类型
     * int intVar2 = Integer.parseInt("100");
     * int intVar3 = Integer.parseInt("ABC", 16);
     * System.out.println("intVar2 = " + intVar2);
     * System.out.println("intVar3 = " + intVar3);
     * 
     * // 基本数据类型转化成字符串
     * String str1 = Integer.toString(100, 2);
     * String str2 = Double.toString(100.00);
     * System.out.println("str1 = " + str1);
     * System.out.println("str2 = " + str2);
     */

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
