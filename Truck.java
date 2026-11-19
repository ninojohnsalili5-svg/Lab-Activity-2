public class Truck extends Vehicle 
{
    private int numberOfWheels;

    public Truck(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    @Override
    void moveForward() {
        System.out.println("Truck moves forward");
    }

    @Override
    void moveBackwards() {
        System.out.println("Truck moves backwards");
    }

    @Override
    void moveLeft() {
        System.out.println("Truck moves left");
    }

    @Override
    void moveRight() {
        System.out.println("Truck moves right");
    }
}