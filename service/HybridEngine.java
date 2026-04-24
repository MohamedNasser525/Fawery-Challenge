package service;
import model.Engine;

public class MixedHybridEngine extends Engine {
    private GasolineEngine gas = new GasolineEngine();
    private ElectronicEngine electric = new ElectronicEngine();

    @Override
    public void increase() {
        // Logic: Electric below 50, otherwise Gas
        if (this.speed < 50) {
            electric.increase();
            this.speed = electric.speed; // Keep Hybrid speed in sync
        } else {
            gas.speed = this.speed; // Sync gas with current speed before acting
            gas.increase();
            this.speed = gas.speed;
        }
    }

    @Override
    public void decrease() {
        if (this.speed < 50) {
            electric.speed = this.speed;
            electric.decrease();
            this.speed = electric.speed;
        } else {
            gas.speed = this.speed;
            gas.decrease();
            this.speed = gas.speed;
        }
    }
}