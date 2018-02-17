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
public class DisplayDept {
    
    private SamsungFactory.KeyboardDept keyboardDept;

    public void setKeyboardDept(SamsungFactory.KeyboardDept keyboardDept) {
        this.keyboardDept = keyboardDept;
    }
    
    
    public void receive(Phone phone){
        createDisplay(phone);
        keyboardDept.receive(phone);
    }
    
    public void createDisplay(Phone phone) {
        Display display = new Display(5);
        phone.setDisplay(display);
    }
    
}
