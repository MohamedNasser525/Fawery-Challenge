package service;
import model.Engine;

public class ElectricEngine implements Engine {
private int internalSpeed = 0;
    public void start() { System.out.println("Electric Engine Started."); }
    public void stop() { System.out.println("Electric Engine Stopped."); }
    public void setSpeed(int speed) { this.internalSpeed = speed; }
    public void increase() { this.internalSpeed++; }
    public void decrease() { this.internalSpeed--; }
}