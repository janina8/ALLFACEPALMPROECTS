/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devices;

/**
 *
 * @author Cube
 */
public abstract class Devices {
    
    private String name;
    private int weight;
    private Display display;
    private boolean on;
    private boolean powerSocket;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public int getWeight() {
        return weight;
    }

    public Display getDisplay() {
        return display;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Devices() {
        this.powerSocket = powerSocket;
    }
    
    
}
