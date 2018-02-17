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
public class Main {
    public static void main(String[] args) {
      Icecream iceCream = new SimpleIceream();
      
      Icecream icecream = new ChocoladeDecorator(new HoneyDecorator(new NutsDecorator(iceCream, 2), "may"), " белый");
       Icecream icecream2 = new ChocoladeDecorator(new HoneyDecorator(new NutsDecorator(iceCream, 2), "may"), " черный");
       
         Icecream icecream3 = new HoneyDecorator(new HoneyDecorator(new NutsDecorator(iceCream, 2), "коко"), " липовый");
         Icecream icecream4 = new NutsDecorator(new NutsDecorator(new NutsDecorator(iceCream, 2), 10), 10);
      icecream.info(); icecream4.info();
    }
    
}
