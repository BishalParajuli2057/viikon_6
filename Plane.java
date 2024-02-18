public class Plane extends Vehicle {
    public Plane(String manufacturer, String model, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engine = new Engine("Suihkumoottori", 500);
    }

    public void operate() {
        System.out.println(manufacturer+model+"lentää kohteeseen!");
    }

    public String toString() {
        return "Lentokone: " + manufacturer + " " + model + "\nMoottori: " + engine + "\nHuippunopeus: " + maxSpeed + "km/h\n";
    }

}
