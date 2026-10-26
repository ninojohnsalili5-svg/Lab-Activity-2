public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Car("Toyota", "Vios", 2020, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Honda", "Civic", 1995, "Manual");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Truck("Ford", "Ranger", 2018, 6);
        vehicle.displayInfo();
        System.out.println();

        System.out.println("=== Demo 2: Method Parameter ===");

        Car car = new Car("Toyota", "Vios", 2020, 4);

        Motorcycle motor =
            new Motorcycle("Honda", "Civic", 1995, "Manual");

        Truck truck =
            new Truck("Ford", "Ranger", 2018, 6);

        printDetails(car);
        System.out.println();

        printDetails(motor);
        System.out.println();

        printDetails(truck);
        System.out.println();

        System.out.println("=== Demo 3: Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Toyota", "Vios", 2020, 4),
            new Motorcycle("Honda", "Civic", 1995, "Manual"),
            new Truck("Ford", "Ranger", 2018, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}
