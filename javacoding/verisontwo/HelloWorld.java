package javacoding.verisontwo;

public class HelloWorld {
  public static void main(String[] args) {
    Weekdays day = Weekdays.FRIDAY;
    switch (day) {
      case MONDAY:
        System.out.println("周一");
        break;
      case TUESDAY:
        System.out.println("周二");
        break;
      case WEDENSDAY:
        System.out.println("周三");
        break;
      case THURSDAY:
        System.out.println("周四");
        break;
      case FRIDAY:
        System.out.println("周五");
        break;
      default:
        System.out.println("周末");
    }
    System.out.println(day);
    System.out.println(day.getInfo());
    System.out.println(Weekdays.getStaticVar());
    System.out.println(Weekdays.sum);
    System.out.println(day.buga);
  }

}
