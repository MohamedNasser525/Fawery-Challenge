package service;
import model.*;

public class CarFactory {
    public static Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "gas": return new Car(new GasolineEngine());
            case "electric": return new Car(new ElectronicEngine());
            case "hybrid": return new Car(new MixedHybridEngine());
            default: throw new IllegalArgumentException("Unknown Engine Type");
        }
    }
}