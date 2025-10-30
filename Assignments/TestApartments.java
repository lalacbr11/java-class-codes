import java.util.Scanner;

public class TestApartments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create at least five Apartment objects
        Apartment a1 = new Apartment(101, 1, 1, 1200.00);
        Apartment a2 = new Apartment(102, 2, 1, 1500.00);
        Apartment a3 = new Apartment(201, 2, 2, 1800.00);
        Apartment a4 = new Apartment(202, 3, 2, 2200.00);
        Apartment a5 = new Apartment(301, 1, 1, 950.00);

        Apartment[] apartments = {a1, a2, a3, a4, a5};

        // Prompt user for requirements
        System.out.print("Enter minimum number of bedrooms: ");
        int minBedrooms = input.nextInt();

        System.out.print("Enter minimum number of baths: ");
        int minBaths = input.nextInt();

        System.out.print("Enter maximum rent you are willing to pay: ");
        double maxRent = input.nextDouble();

        boolean found = false;
        System.out.println("\nApartments that meet your criteria:");

        // Check apartments
        for (Apartment apt : apartments) {
            if (apt.getBedrooms() >= minBedrooms &&
                apt.getBaths() >= minBaths &&
                apt.getRent() <= maxRent) {
                System.out.println(apt);
                found = true;
            }
        }

        // If none match
        if (!found) {
            System.out.println("Sorry, no apartments match your criteria.");
        }

        input.close();
    }
}
