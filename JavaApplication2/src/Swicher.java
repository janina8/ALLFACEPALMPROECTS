/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Swicher {
    private int min, max, current ;
    private boolean isOn;

    public Swicher() {
        min = 0;
        max = 25;
        current = 15;
    }

    public void swichOn(){
        this.isOn = true;
    }
    public void swichOff(){
        this.isOn = false;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void inсrease(int value) {

        if (isOn) {
            if(current+value <= max)
                this.current = +value;
            else 
                this.current = max;
        }
        System.out.println(current);
        
    }
    public void decrease(int value) {
        
        if(isOn) {
            if(current - value >= min)
                this.current = -value;
            else
                this.current = min;
        }
                System.out.println(current);
    }

    public Swicher(int min, int max, boolean isOn) {
        this.min = min;
        this.max = max;
        this.isOn = isOn;
        this.current = min;
    }

}

