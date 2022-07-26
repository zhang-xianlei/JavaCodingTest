package javacoding.versionone;

// import java.util.Date;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name = " + name
                + ". age = " + age + "]";
    }
    /*
     * private String name;
     * private int age;
     * private Date birthDate;
     * int x = 20;
     * public void setX () {
     * this.x = 200;
     * }
     * public Person(String name, int age, Date d) {
     * this.name = name;
     * this.age = age;
     * birthDate = d;
     * System.out.println(this.toString());
     * 
     * }
     * 
     * public Person(String name, int age){
     * this(name, age, new Date());
     * }
     */

    /*
     * public String getInfo() {
     * return "Person [ name = " + name
     * + ", age = " + age
     * + ", birthDate = " + birthDate
     * + " ] ";
     * }
     */

    /*
     * public Person(String name, int age, Date d) {
     * this.name = name;
     * this.age = age;
     * birthDate = d;
     * System.out.println(this.toString());
     * 
     * }
     * 
     * public void showName () {
     * System.out.println(this.name);
     * }
     * 
     * public Person(String name, int age){
     * this(name, age, null);
     * }
     * 
     * public Person(String name, Date d) {
     * this(name, 30, d);
     * }
     * 
     * public Person(String name){
     * this(name, null);
     * }
     */
    // public Person(int age) {
    // this('zhangxianlei', 40, null)
    // }

    /*
     * @Override
     * public String toString(){
     * return "Person [ name = " + name
     * + ", age = " + age
     * + ", birthDate = " + birthDate
     * + " ] ";
     * }
     */
}
