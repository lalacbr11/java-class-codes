//********************************************************************
//  RollingDice.java       Author: Lewis/Loftus
//
//  Demonstrates the creation and use of a user-defined class.
//********************************************************************

public class RollingDice // class_name
{
   //-----------------------------------------------------------------
   //  Creates two Die objects and rolls them several times.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Die die1, die2; // cappl. Die it means it is the class (variable pointer)
      int sum;

      die1 = new Die(); //instantiation 
      die2 = new Die();

      die1.roll(); // method function roll (.)
      die2.roll(); // method function, own instance than die1
      System.out.println("Die One: " + die1 + ", Die Two: " + die2); // print
      die1.roll(); // process of new number
      die2.setFaceValue(4); // 4 gets send to method
      System.out.println("Die One: " + die1 + ", Die Two: " + die2); // print the new values 

      sum = die1.getFaceValue() + die2.getFaceValue(); // local variable and add  
      System.out.println("Sum: " + sum); // returns sum of die1 and die2 (10), + sum = catnation, joins value of sum with a string

      sum = die1.roll() + die2.roll();
      System.out.println("Die One: " + die1 + ", Die Two: " + die2);
      System.out.println("New sum: " + sum);
   }
}
