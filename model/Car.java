package model;

public class Car {
    private Engine engine;
    private boolean isStarted = false;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        // Carry over current speed to the new engine
        int currentSpeed = (this.engine != null) ? this.engine.speed : 0;
        this.engine = engine;
        this.engine.speed = currentSpeed;
    }

    public void start() {
        this.isStarted = true;
        this.engine.speed = 0;
        System.out.println("Car started at 0 speed.");
    }

    public void stop() {
        if (engine.speed == 0) {
            isStarted = false;
            System.out.println("Car stopped.");
        } else {
            System.out.println("Error: Speed is " + engine.speed + ". Must be 0 to stop.");
        }
    }

    public void accelerate() {
        if (isStarted && engine.speed <= 180) {
            // Requirement: Speed car up by 20. 
            // The car advises engine by triggering internal increase 20 times.
            for (int i = 0; i < 20; i++) {
                engine.increase();
            }
            System.out.println("Accelerating... Car Speed: " + engine.speed);
        }
    }

    public void brake() {
        if (isStarted && engine.speed >= 20) {
            for (int i = 0; i < 20; i++) {
                engine.decrease();
            }
            System.out.println("Braking... Car Speed: " + engine.speed);
        }
    }
}