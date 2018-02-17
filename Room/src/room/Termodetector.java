/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;

/**
 *
 * @author Cube
 */
public class Termodetector {
   
    
    private Controller controller;
    
 
    public void transferTermo(int currentTemp) {
        System.out.println("detercter transfer termo: " + currentTemp);
        controller.analize(currentTemp);
    }

    public Termodetector(Controller controller) {
        this.controller = controller;
    }

   
    
    
}
