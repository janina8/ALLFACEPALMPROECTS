/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Device {
    
/*    Device device = new Device();
    Conditioner conditioner = new Conditioner();
    Object[] devices = new Object[2]; //при создании массива разных классов

    public Device() {
        devices[0] = new Conditioner();
    }
    
    */
    
 
 private boolean isOn;
 private String name;
 private int termo;
 
 public void on() {
     
     this.isOn = true;
     System.out.println(name+("Is on"));
     
 }

    public Device(boolean isOn, String name) {
        this.isOn = isOn;
        this.name = name;
    }

    public Device(boolean isOn, String name, int termo) {
        this.isOn = isOn;
        this.name = name;
        this.termo = termo;
    }
 
 
 
 
 public void increaceTermo() {
     this.termo++;
     System.out.println("Температура увеличена");
 }
 
 public void dicreaceTermo() {
     this.termo--;
      System.out.println("Температура уменьшена");
 }
    
 
 
}
