/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.Comparator;

/**
 *
 * @author Cube
 */
public class ProductByPriceComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
      return Integer.compare(o1.getPrice(),o2.getPrice());
    }
    
}
