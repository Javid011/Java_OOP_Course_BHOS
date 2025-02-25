class Car extends Vehicle {
    public Car(String brand, String model, String color, int mileage, double price) {
        super(brand, model, color, mileage, price);
    }

    public void activateSunroof() {
        System.out.println("Sunroof is opening...");
    }

    @Override
    public void displayFeature() {
        System.out.println("This car has a panoramic sunroof!");
    }
}