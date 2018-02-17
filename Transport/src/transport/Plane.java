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
public class Plane extends AirTransport{

    public Plane(int high, String brand, int speed) {
        super(high, brand, speed);
    }

   public void method(){
       System.out.print(speed);
   }
    
}
