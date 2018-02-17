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
    
      public static void main(String[] args) {
        Desk desk = new Desk();
        Safe safe = new Safe();
        desk.setSafe(safe);
        desk.passwordEnter();
        

        
    }
    
}
    

