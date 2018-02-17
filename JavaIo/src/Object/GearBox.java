/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.io.Serializable;

/**
 *
 * @author Cube
 */
public class GearBox implements Serializable{
    
    private int speedCount;

    public GearBox(int speedCount) {
        this.speedCount = speedCount;
    }

    public int getSpeedCount() {
        return speedCount;
    }
    
    
    
}
