// Author: Laura Neugebauer
// Date: October 29, 2025
// Description: Program that demonstrates switch and conditional statements
// as per assignment instructions.

// Exam Chapter 5

import java.util.Scanner;

public class SwitchConditionalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1 & 2: Prompt for single character
        System.out.print("Enter a single character either A or B: ");
        char single_char = input.next().charAt(0);

        // Step 3: Switch on single_char
        switch (single_char) {
            case 'A':
                System.out.println("Switch on A");
                break;
            case 'B':
                System.out.println("Switch on B");
                break;
            default:
                System.out.println("Error character");
        }

        // Step 4 & 5: Prompt for string literal
        System.out.print("Enter a string literal Fall: ");
        String string_literal = input.next();

        // Step 6: Switch on string_literal
        switch (string_literal) {
            case "Spring":
                System.out.println("Switch on Spring");
                break;
            case "Summer":
                System.out.println("Switch on Summer");
                break;
            case "Fall":
                System.out.println("Switch on Fall");
                break;
            case "Winter":
                System.out.println("Switch on Winter");
                break;
            default:
                System.out.println("Error string");
        }

        // Step 7 & 8: Prompt for numeric value
        System.out.print("Enter an integer numeric value either 0 or 1 or 2: ");
        int numeric_value = input.nextInt();

        // Step 9: Switch on numeric_value
        switch (numeric_value) {
            case 0:
                System.out.println("Switch on 0");
                break;
            case 1:
                System.out.println("Switch on 1");
                break;
            case 2:
                System.out.println("Switch on 2");
                break;
            default:
                System.out.println("Error number");
        }

        // Step 10: Conditional statements sequence
        if (single_char == 'A' && numeric_value == 1) {
            System.out.println("A1");
        } else if (single_char == 'B' || numeric_value == 2) {
            System.out.println("B or 2");
        } else {
            System.out.println("not both A 1, not either B 2");
        }

        // Step 11: If string_literal not equal to Winter
        if (!string_literal.equals("Winter")) {
            System.out.println("string_literal is not equal to Winter");
        }

        // Step 12: Finish program
        System.out.println("Program finished!");

        input.close();
    }
}


/* What Went Wrong / How I Fixed It:

- At first, I tried to use `==` to compare strings, but it didn’t work correctly,
  so I switched to `string_literal.equals("Winter")` for proper comparison.
  
- I accidentally reused variable names in earlier attempts, which caused
  “variable already defined” errors — fixed by declaring each only once.
  
- Initially forgot `break;` statements in switch blocks, which caused fall-through
  (executed all cases). Added `break;` to fix the issue.
  
- Added `input.close()` to prevent the resource leak warning.

*/
