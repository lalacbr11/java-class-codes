// class 10/23/25

import java.util.Scanner;

public class SwitchProg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ---- Integer switch ----
        System.out.print("Enter your year e.g. 1,2,3,4: ");
        int year = scan.nextInt();

        switch (year) {
            case 1:
                System.out.println("Freshman");
                break;
            case 2:
                System.out.println("Sophomore");
                break;
            case 3:
                System.out.println("Junior");
                break;
            case 4:
                System.out.println("Senior");
                break;
            default:
                System.out.println("Invalid year");
        }
        System.out.println("Year switch has ended.\n");

        // ---- Char switch ----
        System.out.print("Enter your letter e.g. A,a,B,b: ");
        char letter = scan.next().charAt(0);

        switch (letter) {
            case 'A':
                System.out.println("A");
                break;
            case 'a':
                System.out.println("a");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'b':
                System.out.println("b");
                break;
            default:
                System.out.println("No match.");
        }
        System.out.println("Letter switch has ended.\n");

        // ---- String switch ----
        scan.nextLine(); // consume leftover newline

        System.out.print("Enter your string literal (e.g. yellow, purple): ");
        String input = scan.nextLine();

        switch (input) {
            case "yellow":
                System.out.println("You entered yellow.");
                break;
            case "purple":
                System.out.println("You entered purple.");
                break;
            default:
                System.out.println("No match.");
        }

        System.out.println("String switch has ended.");
        scan.close();
    }
}
