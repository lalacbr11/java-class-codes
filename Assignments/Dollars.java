import java.util.Scanner;

public class Dollars 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // Ask user for dollar amount
        System.out.print("Enter the total dollar amount: ");
        int dollars = input.nextInt();// Calculate denominations
        int twenties = dollars / 20;
        int remaining = dollars % 20;
        int tens = remaining / 10;
        remaining = remaining % 10;
        int fives = remaining / 5;
        remaining = remaining % 5;
        int ones = remaining;
        
        
        System.out.println("You entered: $" + dollars); // Display results
        System.out.println("That breaks down into:");
        System.out.println(twenties + " twenty dollar bills");
        System.out.println(tens + " ten dollar bills");
        System.out.println(fives + " five dollar bills");
        System.out.println(ones + " one dollar bills");
    }
}


//When I was writing the program, I had trouble with System.out.println. 
//At first, I typed it incorrectly, which caused errors when I tried to compile. 
//I also wrote the word remaining wrong, so the program didn’t recognize the variable. 
//Once I corrected the spelling and used the proper System.out.println statement, the code compiled and ran correctly.