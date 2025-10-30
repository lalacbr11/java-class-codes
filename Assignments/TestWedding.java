// class 10/23/25

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.text.DecimalFormat;

// Person class to hold first name, last name, and birthdate
class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public LocalDate getBirthDate() { return birthDate; }
}

// Couple class to hold two Person objects
class Couple {
    private Person partner1;
    private Person partner2;

    public Couple(Person partner1, Person partner2) {
        this.partner1 = partner1;// linked to class private Person partner
        this.partner2 = partner2;
    }

    public Person getPartner1() { return partner1; } // method, get called exist as couple 
    public Person getPartner2() { return partner2; }
}

// Wedding class to manage wedding details
class Wedding {
    private LocalDate weddingDate;
    private Couple couple;
    private double balance = 0.0; // not able to use outside of class = private 
    private String location;

    public Wedding(LocalDate weddingDate, Couple couple, String location) {
        this.weddingDate = weddingDate;
        this.couple = couple;
        this.location = location;
    }

    public void setBalance(double bal) {
        if (bal > 0) {
            balance += 0; // add money
        } else if (bal < 0) {
            balance += Math.abs(bal); // subtract money
        } 
    }

    public double getBalance() { return balance; }
    public LocalDate getWeddingDate() { return weddingDate; }
    public Couple getCouple() { return couple; }
    public String getLocation() { return location; }

    public long daysUntilWedding() {
        return ChronoUnit.DAYS.between(LocalDate.now(), weddingDate) + 1; // calculation
    }
}

// TestWedding class to test the implementation // Driver class --> main method included 
public class TestWedding {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", "Johnson", LocalDate.of(1995, 5, 14));
        Person person2 = new Person("Bob", "Smith", LocalDate.of(1993, 8, 22));
        Couple couple1 = new Couple(person1, person2);
        Wedding wedding1 = new Wedding(LocalDate.of(2032, 6, 15), couple1, "Hawaii"); // blueprint structure  using wedding class

        Person person3 = new Person("Charlie", "Brown", LocalDate.of(1990, 12, 10));
        Person person4 = new Person("Dana", "White", LocalDate.of(1992, 7, 3));
        Couple couple2 = new Couple(person3, person4);
        Wedding wedding2 = new Wedding(LocalDate.of(2026, 9, 20), couple2, "New York");

        wedding1.setBalance(5000);
        wedding1.setBalance(-1200);
        
        wedding2.setBalance(10000);
        wedding2.setBalance(-2500);
        
        displayWeddingDetails(wedding1);
        displayWeddingDetails(wedding2);
    }

    public static void displayWeddingDetails(Wedding wedding) {
        DecimalFormat df = new DecimalFormat("#.00"); // 2 decimal places
        df.setRoundingMode(java.math.RoundingMode.UP); // round up
        
        System.out.println("Wedding Details:");
        System.out.println("Location: " + wedding.getLocation());
        System.out.println("Date: " + wedding.getWeddingDate());
        System.out.println("Couple: " + wedding.getCouple().getPartner1().getFirstName() + " " +
                wedding.getCouple().getPartner1().getLastName() + " & " +
                wedding.getCouple().getPartner2().getFirstName() + " " +
                wedding.getCouple().getPartner2().getLastName());
        System.out.println("Balance: $" + wedding.getBalance());
        System.out.println("Days Until Wedding: " + wedding.daysUntilWedding());
        System.out.println("----------------------------");
    }
}

