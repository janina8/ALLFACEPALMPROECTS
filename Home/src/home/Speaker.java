/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.util.Arrays;

/**
 *
 * @author Cube
 */
public class Speaker {
    

   
    
    public void speak(Apartament apartament) throws ReturnExeprion{
        System.out.println("Вам звонят! Квартира номер: "+apartament.getNumber());
        
        throw new ReturnExeprion();
            
        
    }

   
}
