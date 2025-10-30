// Example of Overriding in Java

class Animal { // Animal is the Base class
   Animal(){ // Constructor automatically executes upon instantiation,
             // see extends below, and also see new Animal() below.
      System.out.println("Animal constructor.");
    }
    
    
    public void move() {
        System.out.println("Animal is moving.");
    }
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal { // Dog is the Derived class
   Dog(){ // constructor automatically executes upon instantiation, see new Dog() below.
      System.out.println("Dog constructor.");
    }
    
    int age = 5;
    
    //The move method from BAse class, is overriden in this method.
    public void move() {
      System.out.println("Dog is running.");
    }
    
    public void bark() {
      System.out.println("Dog is barking.");
    }
    
    public String toString(){
      String result = ("My dog's age is " + age);
      return result;
    }
}
      

public class TestOverride { // driver class
    public static void main(String[] args)
    {
      Animal a = new Animal();      // Reference Animal 
      Dog d = new Dog();            // Reference Dog. Exstands Animal Output: Animal Constructor
      
      d.eat(); // Dog does not have method eat so use Animal eat.  Output: Animal is eating. 
      
      d.bark(); // Dog does have method bark so use Dog bark.  Output: Dog is barking.
      
      a. move(); // Animal must have method move to use.  Output: Animal is moving. 
      
      // Override animal and use Dog mehtod move.   Output: Dog is running. 
      // Comment out Dog.move() method above in class Dog 
      // then d.move() below is inherited from Animal.
      d.move(); // Outpur: Dog is running.
      
      System.out.println("Dog age = " + d.age);
      System.out.println("From the Dog toString comes ->" + d);
      
      String return_from_Dog_toString;
      return_from_Dog_toString = d.toString();
      System.out.println("Printing the call return of Dog toString --> " + 
         return_from_Dog_toString);
      
    } 
}