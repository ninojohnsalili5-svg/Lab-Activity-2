public class Main {
    public static void main(String[] args) {

    Vehicle v1 = new Vehicle("Toyota", "Camry", 2018);
   
        System.out.println("Vehicle 1:");
        v1.displayInfo();

    Vehicle v2 = new Vehicle("Volkswagen", "Beetle", 1972);
   
        System.out.println("Vehicle 2:");
        v2.displayInfo();

    Vehicle v3 = new Vehicle("BMW", "M3", 2025);
   
        System.out.println("Vehicle 3:");
        v3.displayInfo();

    }
}