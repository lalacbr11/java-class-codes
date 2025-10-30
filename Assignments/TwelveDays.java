// TwelveDays.java
// Displays the lyrics of "The Twelve Days of Christmas" starting from any day entered by the user.

import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of Christmas (1–12): ");
        int day = input.nextInt();

        System.out.println();

        switch (day) {
            case 12:
                System.out.println("On the twelfth day of Christmas, my true love sent to me");
                System.out.println("Twelve drummers drumming");
            case 11:
                if (day == 11) System.out.println("On the eleventh day of Christmas, my true love sent to me");
                System.out.println("Eleven pipers piping");
            case 10:
                if (day == 10) System.out.println("On the tenth day of Christmas, my true love sent to me");
                System.out.println("Ten lords a-leaping");
            case 9:
                if (day == 9) System.out.println("On the ninth day of Christmas, my true love sent to me");
                System.out.println("Nine ladies dancing");
            case 8:
                if (day == 8) System.out.println("On the eighth day of Christmas, my true love sent to me");
                System.out.println("Eight maids a-milking");
            case 7:
                if (day == 7) System.out.println("On the seventh day of Christmas, my true love sent to me");
                System.out.println("Seven swans a-swimming");
            case 6:
                if (day == 6) System.out.println("On the sixth day of Christmas, my true love sent to me");
                System.out.println("Six geese a-laying");
            case 5:
                if (day == 5) System.out.println("On the fifth day of Christmas, my true love sent to me");
                System.out.println("Five golden rings");
            case 4:
                if (day == 4) System.out.println("On the fourth day of Christmas, my true love sent to me");
                System.out.println("Four calling birds");
            case 3:
                if (day == 3) System.out.println("On the third day of Christmas, my true love sent to me");
                System.out.println("Three french hens");
            case 2:
                if (day == 2) System.out.println("On the second day of Christmas, my true love sent to me");
                System.out.println("Two turtle doves and");
            case 1:
                if (day == 1) System.out.println("On the first day of Christmas, my true love sent to me");
                System.out.println("A partridge in a pear tree");
                break;
            default:
                System.out.println("Please enter a number between 1 and 12.");
        }

        input.close();
    }
}
