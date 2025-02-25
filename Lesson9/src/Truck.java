class Truck extends Vehicle {
    public Truck(String brand, String model, String color, int mileage, double price) {
        super(brand, model, color, mileage, price);
    }

    public void loadCargo() {
        System.out.println("Loading cargo onto the truck...");
    }

    @Override
    public void displayFeature() {
        System.out.println("This truck has an advanced cargo management system!");
    }
}