// Example of Overriding in Java
class Animal {
    void move() {
        System.out.println("Animal is moving.");
    }
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    void move() {  // overrides Animal.move()
        System.out.println("Dog is running.");
    }
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();  // Dog is running.
        d.eat();   // Animal is eating.
        d.bark();  // Dog is barking.

        // Polymorphism demo:
        Animal a = new Dog();
        a.move();  // Dog is running. (dynamic dispatch)
        a.eat();   // Animal is eating.
        // a.bark(); // not allowed: reference type is Animal
    }
}
