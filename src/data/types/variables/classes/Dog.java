package data.types.variables.classes;

public class Dog
{
  // a class has state and behavior
  String name;
  int    age;
  String breed;
  String color;
  int    numberOfLegs;

  void bark()
  {
    System.out.printf("Bark! My name is: " + name);
  }

  @Override
  public String toString()
  {
    return "Dog" + "\n" +
        "name: " + name + "\n" +
        "age: " + age + "\n" +
        "breed: " + breed + "\n" +
        "color: " + color + "\n" +
        "numberOfLegs: " + numberOfLegs;
  }
}
