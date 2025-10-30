// TestMonthHandling.java
// Demonstrates how LocalDate handles adding months to end-of-month dates

import java.time.LocalDate;

public class TestMonthHandling
{
   public static void main(String[] args)
   {
      // Get the current year dynamically
      int currentYear = LocalDate.now().getYear();

      // Create two LocalDate objects for Jan 31 and Dec 31 of the current year
      LocalDate jan31 = LocalDate.of(currentYear, 1, 31);
      LocalDate dec31 = LocalDate.of(currentYear, 12, 31);

      // Display original dates
      System.out.println("Original Dates:");
      System.out.println("January 31, " + currentYear + ": " + jan31);
      System.out.println("December 31, " + currentYear + ": " + dec31);
      System.out.println();

      // Add 1, 2, and 3 months to each and display results
      System.out.println("When months are added to January 31:");
      System.out.println(" +1 month: " + jan31.plusMonths(1));
      System.out.println(" +2 months: " + jan31.plusMonths(2));
      System.out.println(" +3 months: " + jan31.plusMonths(3));
      System.out.println();

      System.out.println("When months are added to December 31:");
      System.out.println(" +1 month: " + dec31.plusMonths(1));
      System.out.println(" +2 months: " + dec31.plusMonths(2));
      System.out.println(" +3 months: " + dec31.plusMonths(3));
   }
}
