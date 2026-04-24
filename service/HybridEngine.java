package service;
import model.Engine;

public class HybridEngine implements Engine {
private final Engine gasEngine = new GasEngine();
    private final Engine electricEngine = new ElectricEngine();
    private Engine operatingEngine;
    private int speed = 0;

    @Override
    public void start() {
        operatingEngine = electricEngine;
        electricEngine.start();
    }

    @Override
    public void setSpeed(int newSpeed) {
        // Switch logic: Crossing the 50 km/h boundary
        if (newSpeed >= 50 && this.speed < 50) {
            electricEngine.stop();
            gasEngine.start();
            operatingEngine = gasEngine;
        } else if (newSpeed < 50 && this.speed >= 50) {
            gasEngine.stop();
            electricEngine.start();
            operatingEngine = electricEngine;
        }
        this.speed = newSpeed;
        operatingEngine.setSpeed(newSpeed);
    }

    @Override
    public void stop() { operatingEngine.stop(); }

    @Override
    public void increase() { operatingEngine.increase(); }

    @Override
    public void decrease() { operatingEngine.decrease(); }
}