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
public class SmartPhone implements USB{
    
    private String brand;
    private int price;
    
        @Override
    public String info() {
      return brand+" "+ price;
    }
    
    
}
