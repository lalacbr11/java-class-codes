// Exam 3
// Laura Neugebauer

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

// Driver

public class Zoo2 {
    public static LocalDate tdate;

    public static final boolean PRINT_CONSTRUCTORS = true;
    static void cprintln(String s) { if (PRINT_CONSTRUCTORS) System.out.println(s); }
    static void line() { System.out.println("--------------------------------------------------"); }
    
    static void printAllSpeaksSummary(Animal[] animals) {
        System.out.println("All Speaks (summary)");
        System.out.println("Animal: one day at the zoo.");
        System.out.println("Reptile: Reptile sticks out tongue.");
        System.out.println("Bird: Bird whistles.");
        System.out.println("Mammal: Mammal sighs.");
        for (Animal a : animals) {
            System.out.print(a.species() + ": ");
            a.speak();
        }
        line();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter today's year as yyyy: ");
        int t_yyyy = scan.nextInt();
        
        System.out.print("Enter today's month as mm: ");
        int t_mm = scan.nextInt();
        
        System.out.print("Enter today's day as dd: ");
        int t_dd = scan.nextInt();
        
        tdate = LocalDate.of(t_yyyy, t_mm, t_dd);




        Snake   snake   = new Snake(2023, 9, 2);
        Lizard  lizard  = new Lizard(2022, 3, 14);
        Parrot  parrot  = new Parrot(2020, 6, 7);
        Eagle   eagle   = new Eagle(2019, 5, 21);
        Penguin penguin = new Penguin(2021, 1, 9);
        Horse   horse   = new Horse(2018, 11, 30);
        Bat     bat     = new Bat(2022, 8, 25);

        Animal[] animals = { snake, lizard, parrot, eagle, penguin, horse, bat };

        System.out.println();
        line();
        System.out.println("ZOO REPORT (" + tdate + ")");
        line();

        for (Animal a : animals) {
        
            System.out.println("Species: " + a.species());
            System.out.println("Age: " + a.ageString());
            a.skin(); 
            System.out.print("Speak: "); a.speak();
            System.out.print("Move:  "); a.move();
            System.out.print("Eat:   "); a.eat();
            line();
        }
    }
}


// Level 3

class Animal {
    LocalDate dob;     
    Period agePeriod;

    public Animal() {
        Zoo2.cprintln("Animal constructor");
    }

    public Period calcAge(LocalDate dob) {
        return Period.between(dob, Zoo2.tdate);
    }


    public void skin()  { System.out.println("Animal have skin with texture."); }
    public void move()  { System.out.println("Animal moves location."); }
    public void eat()   { System.out.println("Animal eats when hungry and drinks when thirsty."); }
    public void speak() { System.out.println("Animal speaks when has something to say to others."); }

    public String species() { return "Animal"; }

    protected String ageString() {
        Period p = calcAge(dob);
        return p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days";
    }

    @Override public String toString() { return "Animal toString: "; }
}


//  Level 2

class Reptile extends Animal {
    public Reptile() {
        super();
        Zoo2.cprintln("Reptile constructor");
    }
    @Override public void skin()  { 
    
    System.out.println("Reptiles have skin with scales."); 
    
    }
    @Override public void move()  { 
    
    System.out.println("Reptiles move by walking, running, or slithering."); 
    
    }
    @Override public void eat()   { 
    
    System.out.println("Reptiles eat plants or animals."); 
    
    System.out.println("Reptiles drink water."); 
    
    }
    
    @Override public void speak() { 
    
    System.out.println("Reptile sticks out tongue.");
    
    }
    
    @Override public String species() { 
      return "Reptile"; 
      
    }
    
    @Override public String toString() {
      return "Reptile toString: "; 
      
    }
}

class Bird extends Animal {
    public Bird() {
        super();
        Zoo2.cprintln("Bird constructor");
    }
    @Override public void skin()  { 
    
    System.out.println("Birds have skin with feathers."); 
    
    }
    
    @Override public void move()  { 
    
    System.out.println("Birds move by flying or walking."); 
    
    }
    
    @Override public void eat()   { 
    
    System.out.println("Birds eat worms or pellets."); 
    
    }
   
    @Override public void speak() { 
    
    System.out.println("Bird whistles."); 
    
    }
    
    @Override public String species() { 
      return "Bird"; 
    }
    
    @Override public String toString() { 
      return "Bird toString: "; 
    
    }
}


class Mammal extends Animal {
    public Mammal() {
        super();
        Zoo2.cprintln("Mammal constructor");
    }
    
    @Override public void skin()  { 
    
    System.out.println("Mammals have skin with flesh."); 
    
    }
    
    @Override public void move()  { 
    
    System.out.println("Mammals move by flying or walking."); 
    
    }
    @Override public void eat()   { 
    
    System.out.println("Mammals eat worms or pellets."); 
    System.out.println("Mammals drink water."); 
    
    }
    
    @Override public void speak() { 
    
    System.out.println("Mammal sighs."); 
    
    }
    
    @Override public String species() { 
      return "Mammal";
    }
    
   
    @Override public String toString() { 
      return "Mammals toString: "; 
      
      }
}




// Level 1


class Snake extends Reptile {
    public Snake(int yyyy, int mm, int dd) {
        super();
        Zoo2.cprintln("Snake constructor");
        this.dob = LocalDate.of(yyyy, mm, dd);
        this.agePeriod = calcAge(this.dob);
    }
    @Override public String species() { 
      return "Snake"; 
      
    }
    
    
    @Override public void move()  { 
    
    System.out.println("Snake crawls."); 
    
    } 
    
    @Override public void eat()   { 
    
    System.out.println("Animal eats when hungry and drinks when thirsty."); 
    
    } 
    
    @Override public void speak() {
     
    System.out.println("Snake hiss."); 
    
    }
}



class Lizard extends Reptile {
    public Lizard(int yyyy, int mm, int dd) {
        super();
        Zoo2.cprintln("Lizard constructor");
        this.dob = LocalDate.of(yyyy, mm, dd);
        this.agePeriod = calcAge(this.dob);
    }
    
    @Override public String species() { 
      return "Lizard"; 
    }
    
    @Override public void move()  { 
    
    System.out.println("Lizard runs."); 
    
    }
   
    @Override public void eat()   { 
    
    System.out.println("Animal eats when hungry and drinks when thirsty."); 
    
    }
}

class Parrot extends Bird {
    public Parrot(int yyyy, int mm, int dd) {
        super();
        Zoo2.cprintln("Parrot constructor");
        this.dob = LocalDate.of(yyyy, mm, dd);
        this.agePeriod = calcAge(this.dob);
    }
    
    @Override public String species() { 
      return "Parrot"; 
    
    }
    
    @Override public void speak() { 
    
    System.out.println("Parrot hello."); 
    
    }
    
    @Override public void eat()   { 
    
    System.out.println("Animal eats when hungry and drinks when thirsty."); 
    
    }
}

class Eagle extends Bird {
    public Eagle(int yyyy, int mm, int dd) {
        super();
        Zoo2.cprintln("Eagle constructor");
        this.dob = LocalDate.of(yyyy, mm, dd);
        this.agePeriod = calcAge(this.dob);
    }
    
    @Override public String species() { 
      return "Eagle"; 
      
    }
    
    @Override public void speak() { 
    
    System.out.println("Eagle great.");
   
    }
    
    @Override public void eat()   { 
    
    System.out.println("Animal eats when hungry and drinks when thirsty."); 
    
    }
}



class Penguin extends Bird {
    public Penguin(int yyyy, int mm, int dd) {
        super();
        Zoo2.cprintln("Penguin constructor");
        this.dob = LocalDate.of(yyyy, mm, dd);
        this.agePeriod = calcAge(this.dob);
    }
    
    @Override public String species() { 
      return "Penguin"; 
    
    }
    
    @Override public void move()  { 
    
    System.out.println("Penguin walks."); 
    
    } 
    
    @Override public void speak() { 
    
    System.out.println("Penguin laugh."); 
    
    }
    
    @Override public void eat()   { 
    
    System.out.println("Animal eats when hungry and drinks when thirsty."); 
    
    }
}



class Horse extends Mammal {
    public Horse(int yyyy, int mm, int dd) {
        super();
        Zoo2.cprintln("Horse constructor");
        this.dob = LocalDate.of(yyyy, mm, dd);
        this.agePeriod = calcAge(this.dob);
    }
    
    @Override public String species() {
      return "Horse"; 
    }
    
    @Override public void move()  { 
    
    System.out.println("Horse gallops."); 
    
    }
    
    @Override public void speak() { 
    
    System.out.println("Horse hehehe."); 
    
    }
    
    @Override public void eat()   { 
    
    System.out.println("Animal eats when hungry and drinks when thirsty."); 
    
    }
}

class Bat extends Mammal {
    public Bat(int yyyy, int mm, int dd) {
        super();
        Zoo2.cprintln("Bat constructor");
        this.dob = LocalDate.of(yyyy, mm, dd);
        this.agePeriod = calcAge(this.dob);
    }
    
    @Override public String species() { 
      return "Bat"; 
    }
    
    @Override public void move()  { 
    
    System.out.println("Bat flies."); 
    
    }
    
    @Override public void speak() { 
    
    System.out.println("Bat screech."); 
    
    }
    
    @Override public void eat()   { 
    
    System.out.println("Animal eats when hungry and drinks when thirsty."); 
    
    }
}




/*
Reflection (Exam 3 – Zoo2)

What went wrong & fixes:
• Syntax/identifier error: wrote protected String = "feathers"; --> fixed to protected String skin = "feathers";
• Wrong variable name in date: used t_dd_ --> corrected to t_dd.
• Misspelled class names: Eagel / Penguine --> Eagle / Penguin.
• Wrong static reference: Zoo.tdate while driver is Zoo2 --> changed to Zoo2.tdate.
• Constructors not showing: PRINT_CONSTRUCTORS was false --> enable it to demonstrate constructor chaining.

Design corrections:
• Level-1 (species) constructors now set dob and compute agePeriod via Period.between(dob, Zoo2.tdate).
• toString() returns text only (no printing inside), and Level-1 toString() reports DOB + age (Y/M/D).
• Overrides match spec: Lizard inherits Reptile speak (“not assigned”); Parrot/Eagle inherit Bird move (fly); Penguin overrides move to walk; Snake crawls; Horse gallops; Bat flies.

Lessons learned:
• Compile early/often; keep names consistent; avoid printing inside toString(); use one shared “today” (tdate) for age;
*/
