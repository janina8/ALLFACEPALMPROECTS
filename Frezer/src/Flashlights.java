/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Flashlights {

    private boolean on;

    public void flashLightOn() {
        this.on = true;

        System.out.println("The Flashlight is ON");

    }

    public Flashlights(boolean on) {
        this.on = on;

    }
    public void flashLightOff(){
        this.on = false;
        System.out.println("The Flashlight is OFF");
    }
}