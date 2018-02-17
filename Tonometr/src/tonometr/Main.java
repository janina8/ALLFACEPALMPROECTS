/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        
   
        Arm arm = new Arm(90, 120, 96);
        Mangetta mangetta = new Mangetta();
        Tonometr tonometr = new Tonometr();
        
        tonometr.setMangetta(mangetta);
        mangetta.put(arm);
        
        tonometr.start();
    }
    
}
