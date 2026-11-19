public class Car extends Vehicle 
{
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }

    @Override
    void moveForward() {
        System.out.println("Car moves forward");
    }

    @Override
    void moveBackwards() {
        System.out.println("Car moves backwards");
    }

    @Override
    void moveLeft() {
        System.out.println("Car moves left");
    }

    @Override
    void moveRight() {
        System.out.println("Car moves right");
    }
}