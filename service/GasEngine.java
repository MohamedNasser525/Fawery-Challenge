package service;
import model.Engine;

public class GasolineEngine extends Engine {
    @Override
    public void increase() {
        this.speed++;
    }

    @Override
    public void decrease() {
        this.speed--;
    }
}