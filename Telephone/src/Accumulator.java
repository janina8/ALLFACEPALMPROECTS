/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Accumulator {
    
    private int maxCapacity;
    private int minCapacity;
    private int currentCapacity;
    
    
   public int dischardge(int value){
       if ((currentCapacity - value) >= minCapacity)
          return currentCapacity -= value;
  
       else 
           return 0;
   }
   public int chardge(){
       currentCapacity = maxCapacity;
       return currentCapacity;
   }

    public Accumulator(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = maxCapacity/10;
        this.currentCapacity = maxCapacity;
    }
    
}
