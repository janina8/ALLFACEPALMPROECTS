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
        
        
        Product banana = new Banana(12, "bananas", 25);
      
        Supermarcket supermarket = new Supermarcket();
        supermarket.dispetcherTakeProduct(banana);
        
        Ball ball = new Ball("Kokoko", 5);
        supermarket.dispetcherTakeProduct(ball);
        
        System.err.println(supermarket);
        
        
     
    }
    
}
