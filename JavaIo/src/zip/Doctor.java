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
public class Doctor extends Person{
    private String type;

    public Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Doctor{" + "type=" + type + '}';
    }
    
}
