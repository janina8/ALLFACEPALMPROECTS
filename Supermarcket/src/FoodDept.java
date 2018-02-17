
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
public class FoodDept {
    
    private Dispetcher dispetcher;
    private ArrayList<Food> products ;      //= new ArrayList<>();
    
    public FoodDept(){
        this.products = new ArrayList<>();
        this.dispetcher = dispetcher;
    }
    
    public void addFood(Food food){
        products.add(food);
    }

     @Override
    public String toString() {
        String info = "\nFood department contains: \n";
        for (int i = 0; i < products.size(); i++) {
            info = info + products.get(i)+"\n";
        }
        return info;

    }
    
}
