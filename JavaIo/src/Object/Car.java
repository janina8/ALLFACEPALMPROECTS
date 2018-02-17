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
public class Car implements Serializable{
    
    
    private String brand;
    private String color;
    private Engine engine;
    private GearBox gearBox;

    public Car(String brand, String color, Engine engine, GearBox gearBox) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }
    
    
    
    
    
}
