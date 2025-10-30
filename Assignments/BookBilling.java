import java.util.Scanner;

public class BookBilling {

    // price and tax
    static final double PRICE = 14.99;
    static final double TAX = 0.08;

    // 1) no parameters
    public static double computeBill() {
        return PRICE + PRICE * TAX;
    }

    // 2) one parameter (quantity)
    public static double computeBill(int qty) {
        return (qty * PRICE) * (1 + TAX);
    }

    // 3) two parameters (quantity + coupon)
    public static double computeBill(int qty, double coupon) {
        return ((qty * PRICE) - coupon) * (1 + TAX);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int qty = input.nextInt();

        System.out.print("Enter coupon value: ");
        double coupon = input.nextDouble();

        // show results of all three methods
        System.out.println("One book: $" + computeBill());
        System.out.println("Quantity only: $" + computeBill(qty));
        System.out.println("Quantity with coupon: $" + computeBill(qty, coupon));
    }
}
