/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

/**
 *
 * @author Cube
 */
public class Ship extends WaterTransport {

    public Ship(int deps, String brand, int speed) {
        super(deps, brand, speed);
    }
    
    
    
      
    public void swim(){
        System.out.println(getBrand()+ "is swimming");
    }

   
    
}
