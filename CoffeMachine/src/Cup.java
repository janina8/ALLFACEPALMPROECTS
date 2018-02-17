
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Cup {
    
    private ArrayList <Ingridient> ingridients = new ArrayList<>();
    
    private String drinkType;
    
    public void addIngridient(Ingridient ingridient){
        this.ingridients.add(ingridient);
    }
    
    public void printCup(){
        System.out.println(drinkType);
        for(int i = 0; i < ingridients.size();i++){
        Ingridient currentIngredient = ingridients.get(i);
        System.out.println(currentIngredient.getName());
        }
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
    
    
}
