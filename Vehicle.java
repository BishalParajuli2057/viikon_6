public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected Engine engine;

    public Vehicle() {
    }
    public String display() {
        return "Vehicle: " + manufacturer + " " + model + ", Max Speed: " + maxSpeed + "km/h, Engine: " + engine.getName() + " " + engine.getPower() + "kW";
    }
    public void operate() {
        System.out.println("Operating a generic vehicle.");
    }
}

