// Java program to demonstrate working of method overloading in Java.

public class Overload {

    // Overloaded show() methods
    public void show(int x) {
        System.out.println("In int: " + x);
    }

    public void show(String s) {
        System.out.println("In String: " + s);
    }

    public void show(byte b) {
        System.out.println("In byte: " + b);
    }

    public void show(double d) {
        System.out.println("In double: " + d);
    }

    // Overloaded sum() methods
    public int sum(int x, int y) {
        return x + y;
    }

    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    // Driver code
    public static void main(String[] args) {
        byte a = 25;

        Overload obj = new Overload();

        // Testing show()
        obj.show(a);        // byte
        obj.show("hello");  // String
        obj.show(250);      // int
        obj.show('A');      // char -> promoted to int (prints 65)
        obj.show("A");      // String
        obj.show(7.5f);     // float -> widened to double, calls show(double)

        // Testing sum()
        System.out.println("Sum of 10 and 20: " + obj.sum(10, 20));           // 30
        System.out.println("Sum of 10, 20 and 30: " + obj.sum(10, 20, 30));   // 60
        System.out.println("Sum of 10.5 and 20.5: " + obj.sum(10.5, 20.5));   // 31.0
    }
}
