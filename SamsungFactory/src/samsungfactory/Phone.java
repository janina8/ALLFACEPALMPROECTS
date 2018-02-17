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
public class Phone {
    
    private Display display;
    private String name;
    private Keyboard keyboard;

    public String show(){
       return name+display.getSize()+keyboard.getButtonCount();
    
    }
    public Phone(String name) {
        this.name = name;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    
    
}
