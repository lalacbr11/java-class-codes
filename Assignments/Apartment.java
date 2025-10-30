public class Apartment {
    // Fields
    private int apartmentNumber;
    private int bedrooms;
    private int baths;
    private double rent;

    // Constructor
    public Apartment(int apartmentNumber, int bedrooms, int baths, double rent) {
        this.apartmentNumber = apartmentNumber;
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.rent = rent;
    }

    // Get methods
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBaths() {
        return baths;
    }

    public double getRent() {
        return rent;
    }

    // Display information
    public String toString() {
        return "Apartment " + apartmentNumber + " - " +
               bedrooms + " Bedroom(s), " + baths + " Bath(s), Rent: $" +
               String.format("%.2f", rent);
    }
}
