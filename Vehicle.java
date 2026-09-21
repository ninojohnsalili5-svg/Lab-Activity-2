public class Vehicle {
    String brand;
    String model;
    int year;

    void displayInfo() {
        System.out.println(brand + " " + model + " " + year);
    }

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }
}