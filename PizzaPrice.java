public class PizzaPrice
{
    public static void main(String[] args) {
        double price = 13.25;
        double diameter = 16;              // inches
        double radius = diameter / 2;      // 8 inches
        double area = Math.PI * radius * radius; // π * r^2
        double unitPrice = price / area;   // price per square inch

        System.out.println("The round 16 inch diameter pizza price is $" + price
            + ", has an area of " + String.format("%.3f", area) + " square inches"
            + ", and its Unit Price is $" + String.format("%.2f", unitPrice) + " per square inch.");
    }
}
