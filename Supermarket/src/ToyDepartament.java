
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
public class ToyDepartament {
    
    
    private ArrayList<Product> toyDepartament = new ArrayList<>();


 

    public void addProducts(Product product) {
        toyDepartament.add(product);
    }

    
    public int toyDepartamentSize(){
          return toyDepartament.size();
      }
}
