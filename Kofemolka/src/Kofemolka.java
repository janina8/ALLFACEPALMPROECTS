/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Kofemolka {
    
   private boolean isDoorOpen;
   private boolean isButtonPress;
    private Motor motor = new Motor(true);

    public void doorOpen() {
        this.isDoorOpen = true;
        System.out.println("Door is open");
    }

     public void doorClose() {
        this.isDoorOpen = false;
        System.out.println("Door is close");
    }

    public void buttonOn() {
        if (!isDoorOpen) {
            this.isButtonPress = true;
            System.out.println("Button is On");
            motor.motorOn();
        } else {
            System.out.println("Close the door!");

        }
    }

    public void buttonOff() {
        this.isButtonPress = false;
        System.out.println("Button is Off");
        motor.motorOn();
    }

}
        
//   public Kofemolka(boolean door, boolean button) {
//        this.door = door;
//        this.button = button;
//    }

