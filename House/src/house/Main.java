/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.ArrayList;

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
        
        ArrayList<Integer> flate = new ArrayList<>(100);
        Pult pult = new Pult(5);
        Speaker speaker = new Speaker();
        House house = new House(pult, speaker, flate);
        
        
      house.flates();
        pult.button(10);
 

        
        
    
      
    }
    
}
