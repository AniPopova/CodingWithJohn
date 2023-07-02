package concepts;

public class ArraysStuff
{
  public static void main(String[] args)
  {
    //String [] cars = new String[4];
    String[] cars = {"Toyota", "Honda", "Chevrolet", "Chrysler"};
    //[0][1][2][3]
    //cars[0] = "Toyota";
    //System.out.println(cars[0]);
    cars[3] = "Tesla";
    //System.out.println(cars[3]);
//    for (int i = 0; i < cars.length; i++) { // print in order
//      System.out.println(cars[i]);
//    }
//    for (int i = cars.length - 1; i >= 0; i--) { //<cars.length; i--) { // print backwards
//      System.out.println(cars[i]);
//    }
    //the reason why int i=cars.length-1 because indexes starts from zero, but length is 4

    for (String car : cars) {
      // String car = cars[i]; what is foreach doing
      // here you escape the ArrayOutOfBound exception possibility
      System.out.println(car);
    }
  }
}
