/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Blender {

    private Glass glass;
    private boolean isOn;

    public Blender(Glass glass, PowerSocket powerSochet) {
        this.glass = glass;
    }
    
    public void on() {
        if (glass != null & isOn == true) {
            System.out.println("Блендер включен");
        } else {
            System.out.println("Блендер не включен");
        }
    }
    
    public void powerSocketIsOn(){
        isOn = true;
    }
}
