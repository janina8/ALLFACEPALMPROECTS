/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Arms {
    
    private String armName;
    private int size;

    public Arms(String armName, int size) {
        this.armName = armName;
        this.size = size;
    }

    public String getArmName() {
        return armName;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Arms{" + "armName=" + armName + ", size=" + size + '}';
    }


    }
    
    

