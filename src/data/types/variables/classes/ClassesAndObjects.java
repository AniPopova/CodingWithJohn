package data.types.variables.classes;

public class ClassesAndObjects
{
  public static void main(String[] args)
  {
    Dog myDog = new Dog();
    myDog.name = "Fido";
    myDog.age = 13;
    myDog.breed = "Golden retriever";
    myDog.color = "red";
    myDog.numberOfLegs = 4;

    System.out.println(myDog);
    myDog.bark();
  }
}
