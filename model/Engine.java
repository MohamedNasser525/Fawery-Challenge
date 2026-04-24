package model;

public abstract class Engine {
    // Shared property for all engines
    public int speed = 0;

    public abstract void increase();
    public abstract void decrease();
}