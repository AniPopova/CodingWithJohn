package concepts;

import java.util.Scanner;

public class test
{


  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();

    //your code goes here
    for (int i = 1; i < 4; i++) {
      int left = amount - (amount * 10 / 100);
      amount = left;
      int haveToPay = amount * 10 / 100;

    }

    System.out.print(amount);
  }
}

