/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Accountant extends Employee {
    
  //  private static Accountant accountant = new Accountant("Кура", 200);
 //   private static Accountant accountant2 = new Accountant("Маша", 200);
     private static int score = 0;
  
    
    private Accountant(String name, int salary) {
        super(name, salary);
    }

    public static Accountant getAccountant(String name, int salary) {
        if (score < 3) {
            score++;
           return new Accountant(name, salary);
            
        }
        else return null;

    }

}
