public class Motorcycle extends Vehicle implements Serviceable {
    private String engineType;

    public Motorcycle(String brand, String model, int year, String engineType) {
        super(brand, model, year);
        this.engineType = engineType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
    }

    @Override
    public void moveForward() {
        System.out.println("Motorcycle moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Motorcycle moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("Motorcycle moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Motorcycle moves right");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle is being serviced");
    }
}