import java.util.Scanner;

public class InchesToFeetInteractive 
{
   public static void main(String [] args)
   {
      final int INCHES_PER_FOOT = 12; 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number of inches: ");
      int inches = input.nextInt();
      int feet = inches / INCHES_PER_FOOT;
      int remainingInches = inches % INCHES_PER_FOOT; 
      
      System.out.println(inches + "inches is" + feet + "feet and " + remainingInches + "inches.");
   }
}