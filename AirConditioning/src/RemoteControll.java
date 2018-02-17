/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class RemoteControll {
    
    private AirConditioning airConditioning;
    
    public void termoChange(int value){
        
        airConditioning.setTermo(value);
        
        
    }

    public RemoteControll(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }
    
    
}
