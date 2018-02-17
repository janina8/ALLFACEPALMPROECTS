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
        
       
        AirConditioning airConditioning = new AirConditioning(0);
        RemoteControll remoteControll = new RemoteControll(airConditioning);
        
        remoteControll.termoChange(5);
        
      
    }
    
}
