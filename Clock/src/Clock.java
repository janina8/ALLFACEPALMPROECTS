/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Clock {

    private String currentTime;
    private Mechanism mechanism;
    private Display display;

     public Clock() {

        this.mechanism = new Mechanism();
        this.display = new Display();
    }
    
    
    public void showTime() {

        this.currentTime = mechanism.takeTime();
        display.show("Your current time is: " + currentTime);

    }

   
}
