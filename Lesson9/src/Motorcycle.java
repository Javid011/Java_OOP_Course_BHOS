class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, String color, int mileage, double price) {
        super(brand, model, color, mileage, price);
    }

    public void doWheelie() {
        System.out.println("Performing a wheelie!");
    }

    @Override
    public void displayFeature() {
        System.out.println("This motorcycle has a high-performance exhaust system!");
    }
}