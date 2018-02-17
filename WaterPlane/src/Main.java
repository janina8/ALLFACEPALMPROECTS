/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
//        Boat boat = new Boat("Kursk", "50000 euro");
//        Plane plane = new Plane("Tu-54", "6666 $");
        
        WaterPlane waterPlane = new WaterPlane("Летающая лодка");
        
        waterPlane.fly();
        
        waterPlane.stop();
    }
    
}
