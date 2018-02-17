/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.io.Serializable;

/**
 *
 * @author Cube
 */
public class Engine implements Serializable{
    
    private double volume;
    private int power;

    public Engine(double volume, int power) {
        this.volume = volume;
        this.power = power;
    }

    
    
    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }
    
}
