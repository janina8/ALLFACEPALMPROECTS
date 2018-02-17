/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Motor {
    
    private boolean on;

    public void motorOn() {
        this.on = true;

        System.out.println("The Kofemolka is ON");

    }
    
        public void motorOff() {
        this.on = false;

        System.out.println("The Kofemolka is OFF");

    }

   public Motor(boolean on) {
        this.on = on;

    }
}


