public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Vios", 2020);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle vehicle3 = new Vehicle("Ford", "Ranger", 2018);

        System.out.println("Vehicle 1:");
        vehicle1.displayInfo();
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        System.out.println("Vehicle 2:");
        vehicle2.displayInfo();
        System.out.println("Brand: " + vehicle2.getBrand());
        System.out.println("Model: " + vehicle2.getModel());
        System.out.println("Year: " + vehicle2.getYear());
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        System.out.println("Vehicle 3:");
        vehicle3.displayInfo();
        System.out.println("Brand: " + vehicle3.getBrand());
        System.out.println("Model: " + vehicle3.getModel());
        System.out.println("Year: " + vehicle3.getYear());
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());

        System.out.println();
        System.out.println("setYear Tests:");

        System.out.println("setYear(2000): " + vehicle1.setYear(2000));
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        System.out.println("setYear(1885): " + vehicle1.setYear(1885));
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println();

        System.out.println("setYear(2027): " + vehicle1.setYear(2027));
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println();
        System.out.println("Invalid Constructor Tests:");

        Vehicle invalidVehicle1 = new Vehicle("Test", "Vehicle", 1885);
        System.out.println("New vehicle with year 1885: " + invalidVehicle1.getYear());

        Vehicle invalidVehicle2 = new Vehicle("Test", "Vehicle", 2027);
        System.out.println("New vehicle with year 2027: " + invalidVehicle2.getYear());
    }
}
