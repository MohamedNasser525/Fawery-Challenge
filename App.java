import service.CarFactory;
import service.GasEngine;
import model.Car;
import model.EngineType;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Testing Hybrid Car ---");
        Car quantumCar = CarFactory.createCar(EngineType.HYBRID);   
         quantumCar.start();
        quantumCar.accelerate(); // 20 km/h (Uses Electric)
        quantumCar.accelerate(); // 40 km/h 
        quantumCar.accelerate(); // 60 km/h (Switches to Gas)
        quantumCar.accelerate(); // 60 km/h 
        quantumCar.accelerate(); // 80 km/h
        quantumCar.accelerate(); // 100 km/h
        quantumCar.accelerate(); // 120 km/h 
        quantumCar.accelerate(); // 140 km/h 
        quantumCar.accelerate(); // 180 km/h 
        quantumCar.accelerate(); // 200 km/h 

        //  car can't speed over 200 km/h
        //quantumCar.accelerate(); // 200 km/h (Switches to Gas)

        quantumCar.brake();      
        quantumCar.accelerate(); 
        quantumCar.brake();
        quantumCar.brake();
        quantumCar.brake();
        quantumCar.brake();
        quantumCar.brake();
        quantumCar.brake(); 

        // car can stop when speed be 0 km/h 
        //quantumCar.stop();

        quantumCar.brake();  //(Switches to Electric)
        quantumCar.brake();
        quantumCar.brake();
        quantumCar.brake();

        quantumCar.stop();

        //replace the engine for an existing car.
        System.out.println("\n--- Replacing Engine with Gas ---");
        CarFactory.installEngine(quantumCar, EngineType.ELECTRIC);     }
}
