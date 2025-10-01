import java.util.Scanner;

public class AverageTwoNumbers 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the first number: ");
      double num1 = input.nextDouble();
      
      System.out.print("Enter the second number: ");
      double num2 = input.nextDouble();
      
      double average = (num1 + num2) /2;
      
      System.out.printf("The first number is %.2f, the second number is %.2f, and their average is %.2f%n", num1, num2, average);
    }
}