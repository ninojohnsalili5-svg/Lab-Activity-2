public class Car extends Vehicle implements Serviceable {
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
    public void moveForward() {
        System.out.println("Car moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Car moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("Car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Car moves right");
    }

    @Override
    public void service() {
        System.out.println("Car is being serviced");
    }
}