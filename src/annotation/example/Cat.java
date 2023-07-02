package annotation.example;
@VeryImportant
@Working(smoke = 1)
public class Cat
{
  @ImportantString
  String name;
  int age;

  public Cat(String name)
  {
    this.name = name;
  }

  public Cat(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  @RunImmediately(times = 3)
  public void meow(){
    System.out.println("Meow");
  }
  public void eat(){
    System.out.println("Munch");
  }
}
