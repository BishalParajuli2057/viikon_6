public class Ship extends Vehicle {
    public Ship(String manufacturer, String model, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engine = new Engine("Wärtsillä Super ", 1000);
    }

    public void operate() {
        System.out.println(manufacturer+"seilaa merten äärin!");
    }

    public String toString() {
        return "Laiva: " + manufacturer + " " + model + "\nMoottori: " + engine + "\nHuippunopeus: " + maxSpeed + "km/h\n";
    }

}
