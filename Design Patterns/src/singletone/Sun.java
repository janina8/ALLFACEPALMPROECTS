/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

/**
 *
 * @author Cube
 */
public class Sun {
    private double temp = 102453;
    private int size = 10;
    //private static Sun sun;
    private static Sun sun = new Sun();

    public static Sun getSun() {
//        if(sun == null)
//            sun = new Sun();
//        return sun;
        return sun;
    }
    
    
    public void dercreace(int proc){
        temp = temp-proc;
    }

    public double getTemp() {
        return temp;
    }

    public int getSize() {
        return size;
    }

    private Sun() {
        
    }
    
}
