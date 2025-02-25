public class VehicleCatalogue {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model S", "Red", 10000, 79999.99);
        Car bmw = new Car("BMW", "M5", "Black", 8000, 99999.99);
        Motorcycle yamaha = new Motorcycle("Yamaha", "R1", "Blue", 5000, 20000);
        Truck volvoTruck = new Truck("Volvo", "FH16", "White", 25000, 150000);

        System.out.println(tesla.getBrand() + " " + tesla.getModel());
        tesla.displayFeature();

        System.out.println(bmw.getBrand() + " " + bmw.getModel());
        bmw.displayFeature();

        System.out.println(yamaha.getBrand() + " " + yamaha.getModel());
        yamaha.displayFeature();

        System.out.println(volvoTruck.getBrand() + " " + volvoTruck.getModel());
        volvoTruck.displayFeature();

        System.out.println("=".repeat(50));
        tesla.service(5000);
        yamaha.service(2000);
        volvoTruck.service(10000);
    }
}