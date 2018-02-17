/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Product product = new Product("Milk", "food");
        Product product2 = new Product("Toys", "toy");
        
        Supermarket supermarket = new Supermarket();
        supermarket.resieveProduct(product);
        
        Supermarket.Controller controller = supermarket.new Controller();
      
        supermarket.resieveProduct(product2);
        
        supermarket.statistic();
    }
    
}
