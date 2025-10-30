// Billing.java
// Demonstrates method overloading for computing total bill amounts in a photo book store

public class Billing
{
   // Constant tax rate
   private static final double TAX_RATE = 0.08; // 8%

   // Method 1: one parameter – price of one photo book
   public static double computeBill(double price)
   {
      double total = price + (price * TAX_RATE);
      return total;
   }

   // Method 2: two parameters – price and quantity
   public static double computeBill(double price, int quantity)
   {
      double subtotal = price * quantity;
      double total = subtotal + (subtotal * TAX_RATE);
      return total;
   }

   // Method 3: three parameters – price, quantity, and coupon value
   public static double computeBill(double price, int quantity, double coupon)
   {
      double subtotal = (price * quantity) - coupon;
      double total = subtotal + (subtotal * TAX_RATE);
      return total;
   }

   // Main method to test all three versions
   public static void main(String[] args)
   {
      System.out.println("Testing Billing methods:\n");

      double total1 = computeBill(19.99);                 // One photo book
      double total2 = computeBill(19.99, 3);              // Three books
      double total3 = computeBill(19.99, 5, 10.00);       // Five books with coupon

      System.out.printf("Total for one book: $%.2f%n", total1);
      System.out.printf("Total for three books: $%.2f%n", total2);
      System.out.printf("Total for five books with coupon: $%.2f%n", total3);
   }
}
