// FixDebugFive2.java
// Decides if two numbers are evenly divisible

import java.util.Scanner;

public class FixDebugFive2
{
   public static void main(String[] args)
   {
      int num;
      int num2;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number: ");
      num = input.nextInt();     // add parentheses

      System.out.print("Enter another number: ");
      num2 = input.nextInt();    // add parentheses

      // Correct logical condition:
      // A number is evenly divisible if remainder == 0 in either direction
      if ((num % num2 == 0) || (num2 % num == 0))
      {
         System.out.println("One of these numbers is");
         System.out.println("   evenly divisible into the other.");
      }
      else
      {
         System.out.println("Neither of these numbers is");
         System.out.println("   evenly divisible into the other.");
      }

      input.close();
   }
}
