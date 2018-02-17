/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devices;

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        KeyBoard_1 keyboard = new KeyBoard_1();
        KeyBoard_1 keyboard1 = new KeyBoard_1();
        Display display = new Display();
        Display display2 = new Display();
        KeyBoard_1 keyBoard = new KeyBoard_1();
        
        Phone phone = new Phone();
        phone.setKeyBoard(keyBoard);
        phone.setDisplay(display);
        
        Laptop laptop = new Laptop();
        laptop.setKeyBoard(keyboard1);
        laptop.setDisplay(display2);
        
        CofeeMashine cofeeMashine = new CofeeMashine();
        cofeeMashine.setTimer(5);
        
        
        Blender blender = new Blender();
        blender.setDisplay(display);
        
        
    }
    
}
