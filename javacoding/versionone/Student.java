package javacoding.versionone;

import java.util.Date;
public class Student extends Person {
    public String school;
    int x = 50;
    public void setX () {
        this.x = 10000;
        super.setX();
    }
    public void printX () {
        System.out.println(x);
        System.out.println(super.x);
    }
    
    public Student(String name, int age, Date d, String school){
        super(name, age, d);
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
}
