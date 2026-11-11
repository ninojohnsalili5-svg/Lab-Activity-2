public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackwards();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();
    }

    public static void performService(Serviceable serviceable) {
        serviceable.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Vios", 2020, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Civic", 1995, "Manual");
        Truck truck = new Truck("Ford", "Ranger", 2018, 6);
        Printer printer = new Printer();

        System.out.println("Demo 1: Parent Reference");
        Vehicle vehicle1 = car;
        vehicle1.displayInfo();
        System.out.println();

        System.out.println("Demo 2: Method Parameter");
        printDetails(motorcycle);

        System.out.println("Demo 3: Polymorphic Array");
        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle vehicle : vehicles) {
            printDetails(vehicle);
        }

        System.out.println("Demo 4: Interface Polymorphism");

        Serviceable[] serviceableObjects = {
            car, motorcycle, truck, printer
        };

        for (Serviceable serviceable : serviceableObjects) {
            performService(serviceable);
        }
    }
}