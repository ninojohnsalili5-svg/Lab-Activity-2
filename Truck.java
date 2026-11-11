public class Truck extends Vehicle implements Serviceable {
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
    public void moveForward() {
        System.out.println("Truck moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Truck moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("Truck moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Truck moves right");
    }

    @Override
    public void service() {
        System.out.println("Truck is being serviced");
    }
}