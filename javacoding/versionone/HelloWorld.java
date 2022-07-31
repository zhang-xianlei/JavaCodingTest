package javacoding.versionone;

public class HelloWorld {
  public static void main(String[] args) {
    InterfaceA abc = new ABC();
    System.out.println(abc.methodB());
    // System.out.println(InterfaceA.methodC());
    System.out.println(abc.methodC());
    System.out.println(abc.methodD());
    System.out.println(InterfaceA.methodE());
    // 抽象类继承
    /*
     * Triangle F1 = new Triangle();
     * F1.onDraw();
     * 
     * Figure F2 = new Ellipse();
     * System.out.println(F2 instanceof Ellipse);
     * F2.onDraw();
     * F1.printName();
     * System.out.println(F1.name);
     */

    // 引用类型转换
    /*
     * Person p1 = new Student("Lily", 19, "zhengzhou University");
     * Person p2 = new Worker("Joson", 44, "yongning Ltd");
     * Person p3 = new Person("Coco", 36);
     * Student p4 = new Student("Tom", 20, "tinghua College");
     * Worker p5 = new Worker("Chandeler", 50, "fading Factory");
     * Person p = (Person) p4;
     * Student p11 = (Student) p1;
     * Worker p12 = (Worker) p2;
     * // Student p111 = (Student) p2;
     * if (p2 instanceof Student) {
     * Student p112 = (Student) p2;
     * }
     * System.out.println(p11.toString());
     * System.out.println(p.toString());
     */

    // 应用类型检查
    /*
     * Student student1 = new Student("Tom", 20, "清华大学");
     * Student student2 = new Student("Leo", 19, "北京大学");
     * Student student3 = new Student("Nanaw", 18, "中国科技大学");
     * 
     * Worker worker1 = new Worker("SanZhang", 30, "科大讯飞");
     * Worker worker2 = new Worker("SiLi", 35, "阳光电源");
     * 
     * Person person1 = new Person("John", 45);
     * 
     * System.out.println(student1.toString());
     * Person[] people = { student1, student2, student3, worker1, worker2, person1
     * };
     * 
     * int studentCount = 0;
     * int workerCount = 0;
     * int personCount = 0;
     * for (Person item : people) {
     * if (item instanceof Worker) {
     * workerCount += 1;
     * } else if (item instanceof Student) {
     * studentCount += 1;
     * }
     * if (item instanceof Person) {
     * personCount += 1;
     * }
     * }
     * 
     * System.out.printf("工人人数：%d, 学生人数：%d, 总人数：%d", workerCount, studentCount,
     * personCount);
     */

    /*
     * Figure f1 = new Figure();
     * f1.onDraw();
     * 
     * Figure f2 = new Ellipse();
     * f2.onDraw();
     * 
     * Figure f3 = new Triangle();
     * f3.onDraw();
     */

    // String s1 = new String("Hello");
    // String nameStr = new String('zhangxianlei');
    // String dogName = "little dog";
    // String heName = new String("is a real name");
    // Person newPerson = new Person("zhangxianlei", 47);
    // newPerson.showName();
    // Student lili = new Student("lily", 16, "shushaxiaoxue");
    // lili.setX();
    // lili.printX();
    // newPerson();
    /*
     * String s1 = new String("Hello");
     * String s2 = new String("Hello");
     * String s3 = "HELLo";
     * System.out.println("s1 == s2: " + (s1 == s2));
     * System.out.println("s1.equals(s2):" + (s1.equals(s2)));
     * System.out.println("s1.equalsIgnoreCase(s3):" + (s1.equalsIgnoreCase(s3)));
     * String s4 = "java";
     * String s5 = "Swift";
     * System.out.println("s4.compareTo(s5) : " + (s4.compareTo(s5)));
     */

    /*
     * System.out.println("Hello World");
     * String s5 = "Hello";
     * s5 = s5.concat(" ").concat("world");
     * System.out.println(s5);
     * String sourceStr = "There is a string accessing example";
     * sourceStr = "I`m a better man";
     * int firstCharl = sourceStr.indexOf('r');
     * System.out.println(firstCharl);
     */
  }
}