/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author Cube
 */
public abstract class Food extends Product {
    
    public Food(int number, String type, String brand, double price, String description, boolean isInStock) {
        super(number, type, brand, price, description, isInStock);
    }
    
}
