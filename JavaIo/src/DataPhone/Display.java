/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPhone;

import java.io.Serializable;

/**
 *
 * @author Cube
 */
public class Display implements Serializable{
        public void show (String info){
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "Display{" + '}';
    }
        
}

    

