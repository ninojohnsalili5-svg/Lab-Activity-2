public abstract class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println(brand + " " + model + " " + year);
    }

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }

    abstract void moveForward();
    abstract void moveBackwards();
    abstract void moveLeft();
    abstract void moveRight();
}