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
public class NutsDecorator extends IcecreamDecorator{
    private int nutses;
    
    public NutsDecorator(Icecream icecream, int nutses) {
        super(icecream);
        this.nutses = nutses;
    }
    
      @Override
    public void info() {
        System.out.println("Посыпали орехами " +nutses);
    }
    
    
}
