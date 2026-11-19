public class Motorcycle extends Vehicle 
{
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
    void moveForward() {
        System.out.println("Motorcycle moves forward");
    }

    @Override
    void moveBackwards() {
        System.out.println("Motorcycle moves backwards");
    }

    @Override
    void moveLeft() {
        System.out.println("Motorcycle moves left");
    }

    @Override
    void moveRight() {
        System.out.println("Motorcycle moves right");
    }
}