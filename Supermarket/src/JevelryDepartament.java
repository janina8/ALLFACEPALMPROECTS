
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
public class JevelryDepartament {
 

    private ArrayList<Product> jevelryDepartament = new ArrayList<>();
    
    
    
     public void addProducts(Product product) {
         jevelryDepartament.add(product);
      }

  public int jevelryDepartamentSize(){
          return jevelryDepartament.size();
      }
            
}
 