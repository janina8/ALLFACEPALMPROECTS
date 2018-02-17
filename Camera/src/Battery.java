/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Battery {
    
   private int charge;

    public int getCharge() {
        return charge;
    }


    public Battery(int charge){
        this.charge = charge;
    }
    
   public int recharge() {
       this.charge = 100;
       System.out.println("Батарея заряжена");
       return charge;
   }
   
   public int discharge(int value){
       if(charge - value >0){
           charge = charge - value;
       }
       else {
           charge = 0;
       }
       return charge;
       
   }
}

