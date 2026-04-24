package service;
import model.*;

public class CarFactory {
    public static Car createCar(EngineType type) {
        Car car = new Car();
        installEngine(car, type);
        return car;
    }

    public static void installEngine(Car car, EngineType type) {
        car.setEngine(createEngine(type));
    }

    private static Engine createEngine(EngineType type) {
        return switch (type) {
            case GAS -> new GasEngine();
            case ELECTRIC -> new ElectricEngine();
            case HYBRID -> new HybridEngine();
        };
    }
}