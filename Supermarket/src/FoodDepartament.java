
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
public class FoodDepartament {
    
      private ArrayList<Product> foodDepartament = new ArrayList<>();
   

      
      
      public void addProducts(Product product) {
          foodDepartament.add(product);
      }

   
      public int foodDepartamentSize(){
          return foodDepartament.size();
      }
    
}
