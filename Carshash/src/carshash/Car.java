/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshash;

/**
 *
 * @author Cube
 */
public class Car extends Objects {
   
        private int price;

    public Car(int price, String name) {
        super(name);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "price=" + price + '}';
    }

        

  
  
        
}
