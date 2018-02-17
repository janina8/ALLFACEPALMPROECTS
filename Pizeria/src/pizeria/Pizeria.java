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
public class Pizeria {


    public Pizza makePizza(String pizzaName) {

        Pizza pizza = new Pizza();
        Ingridient flour = new Ingridient("flour");
        pizza.addIngridient(flour);
        Ingridient salt = new Ingridient("salt");
        pizza.addIngridient(salt);

        if (pizzaName.equals("Vegetarian")) {
            pizza.setPizzaType("Vegetarian");
            Ingridient cheese = new Ingridient("cheese");
            pizza.addIngridient(cheese);
            Ingridient tomato = new Ingridient("tomato");
            pizza.addIngridient(tomato);

        }

        if (pizzaName.equals("Pepperoni")) {
             pizza.setPizzaType("Pepperoni");
            Ingridient cheese = new Ingridient("cheese");
            pizza.addIngridient(cheese);
            Ingridient sausage = new Ingridient("sausage");
            pizza.addIngridient(sausage);
        }

        if (pizzaName.equals("Pizza with hamburgers")) {
              pizza.setPizzaType("Pizza with hamburgers");
            Ingridient hamburger = new Ingridient("chamburger");
            pizza.addIngridient(hamburger);
            pizza.addIngridient(hamburger);
            pizza.addIngridient(hamburger);
        }

        return pizza;

    }

  

}
