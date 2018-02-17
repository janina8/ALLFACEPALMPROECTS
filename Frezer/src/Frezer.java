/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Frezer {

    private boolean door;
    private Flashlights flashlights = new Flashlights(true);

    public void doorOpen() {
        this.door = true;
        flashlights.flashLightOn();
        System.out.println("Door is open");
    }

//    public void frezerOpen() {
//        if (door == true) {
//            flashlights.flashLightOn();
//        }
//
//    }
    public void closeDoor() {
        this.door = false;
        flashlights.flashLightOff();
        System.out.println("Door is close");
    }
}
