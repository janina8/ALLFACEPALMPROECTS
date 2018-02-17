
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class TestHashSet {
    
    
     public static void main(String[] args) {
         
     
         
         Product product = new Product(ProductType.FOOD, "aple", 1);
         Product product2 = new Product(ProductType.CLOTHES, "dress", 5);
         Product product3 = new Product(ProductType.TECHNIC, "phone", 50);
         Product product4 = new Product(ProductType.FOOD, "banana", 3);
         Product product5 = new Product(ProductType.FOOD, "chiken", 5);
         Product product7 = new Product(ProductType.FOOD, "aple", 1);
         Product p = product2;
         
         HashSet<Product> set = new HashSet<>();
         set.add(product);
         set.add(product2); set.add(product3); set.add(product4); set.add(product5);
          set.add(product3); set.add(product4); set.add(product5);
         set.add(product2);
         set.add(product7);
         
         for(Product product8:set){
            System.err.println(product8);
         }
     //    System.out.println(product3.hashCode());
        
      //   System.out.println(p.hashCode());
         System.out.println(product7.hashCode());
          System.out.println(product.hashCode());
     }
    
}
