package optionals;

import java.util.Optional;

public class OptionalsDemo
{
  public static void main(String[] args)
  {
    //Cat myCat = findCatByName("Fred");
    Optional<Cat> optionalCat = findCatByName("Fred");

    Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0));
    Cat myCat1 = optionalCat.orElseThrow(); //this is equal to optionalCat.get(); and makes the same thing.

    optionalCat.map(Cat::getAge)
        .orElse(0); //this will return the age if the object exists, or default value if not

    if (optionalCat.isPresent()) {
      System.out.println(optionalCat.get().getAge());
    }
    else{
      System.out.println(0);
    }


//    if(myCat != null) {
//      System.out.println(myCat.getAge());
//    }
//    else{
//      System.out.println(0);
//    }
  }

  /*  private static Cat findCatByName(String name)
    {
      Cat cat = new Cat(name, 3);
      //return cat;
      return null;
    }*/
  private static Optional<Cat> findCatByName(String name) //we could use them as any other obect
  {
    Cat cat = new Cat(name, 3);
    return Optional.ofNullable(cat);
  }
}
