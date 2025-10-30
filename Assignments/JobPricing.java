import java.util.Scanner;

public class JobPricing {
    
    // Method to calculate job price
    public static double calculatePrice(double materials, int workHours, int travelHours) {
        double total = materials + (35 * workHours) + (12 * travelHours);
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for job name
        System.out.print("Enter the job name: ");
        String jobName = input.nextLine();

        // Prompt for materials cost
        System.out.print("Enter the cost of materials: ");
        double materials = input.nextDouble();

        // Prompt for hours of work
        System.out.print("Enter the number of hours of work required: ");
        int workHours = input.nextInt();

        // Prompt for hours of travel
        System.out.print("Enter the number of hours of travel time: ");
        int travelHours = input.nextInt();

        // Compute total price by calling the method
        double estimatedPrice = calculatePrice(materials, workHours, travelHours);

        // Display result
        System.out.printf("The estimated price for %s is: $%.2f%n", jobName, estimatedPrice);
        
        input.close();
    }
}
