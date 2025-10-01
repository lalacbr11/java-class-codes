import java.util.Scanner;
// import java.text.DecimalFormat; 

public class IPO
{ 
      // Input-Processing-Output (IPO)
      
      public static void main(String[] arg)
      {
         Scanner scan = new Scanner(System.in); 
         // DecimalFormat fmt = new DecimalFormat("0.###");
         
         String line; // data type string of character(s)
         int miles = 0; // data type integer no decimal fraction
         double gallons = 0.0, mpg = 0.0; // data type double has decimal fraction
         
             
         System.out.print("Please type first name: ");
         line = scan.nextLine();
         System.out.println("You entered: " + line);
         
         System.out.print("Enter the number of miles: ");
         miles = scan.nextInt();
         
         System.out.print("Enter the number of gallons used: ");
         gallons = scan.nextDouble();
         
         mpg = miles / gallons;
         System.out.printf("Miles Per Gallon = %,.3f \n", mpg); // does not need import DecimalFormat
         // System.out.print("Miles Per Gallon = " + fmt.format(mpg));
         
         
      }
}