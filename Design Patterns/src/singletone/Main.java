/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

import java.util.Date;

/**
 *
 * @author Cube
 */
public class Main {
    
    public static void main(String[] args) {
        
        Sun sun = Sun.getSun();
        Sun sun2 = Sun.getSun();
        Sun sun3 = Sun.getSun();
        sun.dercreace(4);
        
        System.err.println(sun + " "+sun2);
        System.out.println(new Date());
    }
}
