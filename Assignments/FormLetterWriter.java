// FormLetterWriter.java
// Demonstrates method overloading and business letter formatting

public class FormLetterWriter
{
   // Method 1: Takes only the last name
   public static void displaySalutation(String lastName)
   {
      System.out.println("Dear Mr. or Ms. " + lastName + ",");
      System.out.println("Thank you for your recent order.");
      System.out.println();
   }

   // Method 2: Takes first and last name
   public static void displaySalutation(String firstName, String lastName)
   {
      System.out.println("Dear " + firstName + " " + lastName + ",");
      System.out.println("Thank you for your recent order.");
      System.out.println();
   }

   // Main method to test both overloaded versions
   public static void main(String[] args)
   {
      System.out.println("Testing FormLetterWriter methods:\n");

      // Test version with last name only
      displaySalutation("Neugebauer");

      // Test version with first and last name
      displaySalutation("Laura", "Neugebauer");
   }
}
