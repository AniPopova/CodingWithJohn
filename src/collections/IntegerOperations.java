package collections;

import java.util.Scanner;

public class IntegerOperations
{
public static Scanner input = new Scanner(System.in);
  public static void main(String[] args)
  {
    int numOne = Integer.parseInt(input.nextLine());
    int numTwo = Integer.parseInt(input.nextLine());
    int numThree = Integer.parseInt(input.nextLine());
    int numFour = Integer.parseInt(input.nextLine());

    int sum = numOne + numTwo;
    int divide = sum / numThree;
    int result = divide * numFour;

    System.out.println(result);

  }
}
