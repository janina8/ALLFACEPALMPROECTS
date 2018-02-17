/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samsungfactory;

/**
 *
 * @author Cube
 */
public class Box {
   private String boxColor;
   private Phone phone;

    public Box(String boxColor) {
        this.boxColor = boxColor;
    }
    
    public Phone boxOpen() {

        return phone;
    }
    
    public void putPhone(Phone phone){
        this.phone = phone;
    }
}
