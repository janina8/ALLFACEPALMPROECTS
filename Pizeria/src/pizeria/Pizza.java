/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizeria;

import java.util.ArrayList;

/**
 *
 * @author Cube
 */
public class Pizza {
    
    private String pizzaType;
    
      private int pizzaSize;

    
    private ArrayList <Ingridient> ingridients = new ArrayList<>();
    
       public void addIngridient(Ingridient ingridient){
        this.ingridients.add(ingridient);
    }
       
        public void printPizza(){
        System.out.println("Ваша пица называется: " + pizzaType + " Пица такого размера: "+ pizzaSize + " Количество ингридиентов: "+ getIngridientsSize()+ " Рассмотрим ингридиенты: ");

        for(int i = 0; i < ingridients.size();i++){
  //      Ingridient currentIngredient = ingridients.get(i);
        System.out.println(ingridients.get(i).getName());
        }
    }

    public int getIngridientsSize() {
        return ingridients.size();
    }
        
             
        

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    
}
