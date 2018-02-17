/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showsomthing;

/**
 *
 * @author Cube
 */
public class Car implements USB{
    
    private String brand;
    private int engine;

    public Car(String brand, int engine) {
        this.brand = brand;
        this.engine = engine;
    }

    @Override
    public String info() {
     return brand+" "+ engine;
        
    
    }

    
}
