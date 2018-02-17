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
public class HoneyDecorator extends IcecreamDecorator{
    
    public String type;
    
    public HoneyDecorator(Icecream icecream, String type) {
        super(icecream);
        this.type = type;
    }
    
      @Override
    public void info() {
        System.out.println("Посыпали медом"+type);
    }
    
}
