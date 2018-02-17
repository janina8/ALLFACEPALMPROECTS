/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Flashlight {

    public boolean on;

    public void flashLightOn() {
        this.on = true;

        System.out.println("The Flashlight is ON");

    }

    public Flashlight(boolean on) {
        this.on = on;

    }
    
    
}
