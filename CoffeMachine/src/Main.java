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
        
        CoffeMachine coffeMachine = new CoffeMachine();
        coffeMachine.addSugar();
        coffeMachine.addSugar();
        Cup cup = coffeMachine.makeDrink("late");
        cup.printCup();
         Cup cup2 = coffeMachine.makeDrink("tea");
         cup2.printCup();
    }
    
}
