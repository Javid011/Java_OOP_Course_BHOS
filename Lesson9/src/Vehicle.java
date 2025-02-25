public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;
    private int mileage;
    private double price;

    public Vehicle(String brand, String model, String color, int mileage, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void service(int serviceMiles) {
        this.mileage += serviceMiles;
        System.out.println("Serviced your " + brand + " " + model + ". New mileage: " + mileage + " km.");
    }

    public abstract void displayFeature();
}