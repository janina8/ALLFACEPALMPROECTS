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
    
    
   public void dischardge(int value) {
        if ((currentCapacity - value) > minCapacity) {
            currentCapacity = currentCapacity - value;

        }
        else 
            currentCapacity = 0;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }
       
   public int chardge(){
       currentCapacity = maxCapacity;
       return currentCapacity;
   }

    public Accumulator(int maxCapacity, int mixCaoacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.currentCapacity = currentCapacity;
    }
    
}
    
 
