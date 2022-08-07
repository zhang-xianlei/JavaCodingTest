package javacoding.verisontwo;

public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name = " + name + ", age = " + age + ']';
  }

  @Override
  public boolean equals(Object otherObject) {
    if (otherObject instanceof Person) {
      Person otherPerson = (Person) otherObject;
      if (this.age == otherPerson.age) {
        return true;
      }
    }
    return false;
  }
}
