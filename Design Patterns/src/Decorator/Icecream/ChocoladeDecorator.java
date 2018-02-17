/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.Icecream;

/**
 *
 * @author Cube
 */
public class ChocoladeDecorator extends IcecreamDecorator{
    
  private String color;
  
    public ChocoladeDecorator(Icecream icecream, String color) {
        super(icecream);
        this.color = color;
    }
    
   @Override
    public void info() {
        System.out.println("Посыпали шоколад "+color);
    }


    
    
}
