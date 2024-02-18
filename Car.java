public class Car extends Vehicle {
    public Car(String manufacturer, String model, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engine = new Engine("V8",300);
    }

    public String toString2() {
        return manufacturer + model +"paahtaa tietä etenpäin";
    }

    public String toString() {
        return "Auto: " + manufacturer + " " + model + "\nMoottori: " + engine + "\nHuippunopeus: " + maxSpeed + "km/h\n";
    }

}

