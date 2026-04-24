package model;

public class Car {
    private Engine engine;
    private int speed = 0;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.speed = 0;
        engine.start();
        System.out.println("Car started at speed 0.");
    }

    public void stop() {
        if (this.speed == 0) {
            engine.stop();
            System.out.println("Car stopped.");
        } else {
            System.out.println("Error: Speed must be 0 to stop. Current: " + speed);
        }
    }

    public void accelerate() {
        if (this.speed < 200) {
            this.speed += 20;
            engine.setSpeed(this.speed);
            // Task requirement: Advise engine internal speed 1 km/h at a time
            for (int i = 0; i < 20; i++) engine.increase();
            System.out.println("Accelerating... Speed: " + speed);
        }
    }

    public void brake() {
        if (this.speed > 0) {
            this.speed -= 20;
            engine.setSpeed(this.speed);
            for (int i = 0; i < 20; i++) engine.decrease();
            System.out.println("Braking... Speed: " + speed);
        }
    }
}