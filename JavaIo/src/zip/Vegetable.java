/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zip;

import java.io.Serializable;

/**
 *
 * @author Cube
 */
public class Vegetable implements Serializable{
    private String type;

    public Vegetable(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vegetable{" + "type=" + type + '}';
    }
    
    
}
