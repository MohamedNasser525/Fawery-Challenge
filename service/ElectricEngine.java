package service;
import model.Engine;

public class ElectronicEngine extends Engine {
    @Override
    public void increase() {
        this.speed++;
    }

    @Override
    public void decrease() {
        this.speed--;
    }
}