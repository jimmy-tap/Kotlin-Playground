package company.tap.playground.basics.properties;

import company.tap.kotlinexploring.basics.properties.CarKt;

public class Car {

    private String model;

    private final boolean dieselEngine;

    public Car(String model, boolean dieselEngine) {
        this.model = model;
        this.dieselEngine = dieselEngine;

        CarKt carKt = new CarKt("Fiat 128", false);
        carKt.setModel("Audi");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isDieselEngine() {
        return dieselEngine;
    }
}
