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
public abstract class IcecreamDecorator implements Icecream {
    private Icecream icecream;

    @Override
    public void info() {
        System.out.println("Decorator.Icecream.IcecreamDecorator.show()");
    }

    public IcecreamDecorator(Icecream icecream) {
        this.icecream = icecream;
    }

    public void setIcecream(Icecream icecream) {
        this.icecream = icecream;
    }
    
    

}
