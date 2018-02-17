/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizeria;

/**
 *
 * @author Cube
 */
public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Pizeria pizeria =  new Pizeria();
     
        Pizza pizza = pizeria.makePizza("Pepperoni");
        pizza.setPizzaSize(10);
    
        pizza.printPizza();
        
          Pizza pizza2 = pizeria.makePizza("Pizza with hamburgers");
        pizza2.setPizzaSize(10);
     
        pizza2.printPizza();
        
          Pizza pizza3 = pizeria.makePizza("Vegetarian");
        pizza3.setPizzaSize(10);
     
        pizza3.printPizza();
    }
    
}