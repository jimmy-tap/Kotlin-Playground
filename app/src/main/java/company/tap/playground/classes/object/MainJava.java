package company.tap.playground.classes.object;

import company.tap.playground.classes.object.Singleton;
import company.tap.playground.classes.object.VehicleFactory;

@SuppressWarnings("ALL")
public class MainJava {

    private void accessKotlinSingleton() {
        String name = Singleton.INSTANCE.getName();
    }

    private void accessCompanionObject() {
        VehicleFactory.Companion.newVehicle();
        VehicleFactory.newVehicleStatic();
    }
}
