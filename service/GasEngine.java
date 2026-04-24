package service;
import model.Engine;

public class GasEngine implements Engine {
private int internalSpeed = 0;
    public void start() { System.out.println("Gas Engine Started."); }
    public void stop() { System.out.println("Gas Engine Stopped."); }
    public void setSpeed(int speed) { this.internalSpeed = speed; }
    public void increase() { this.internalSpeed++; }
    public void decrease() { this.internalSpeed--; }
}