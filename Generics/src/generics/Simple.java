/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import nonGenerics.Cat;

/**
 *
 * @author Cube
 */
public class Simple {
    
    
    public <V extends Dog, T extends Cat> T method1(V dog){
        return (T)new Cat("Koko", 0);
    }
    
}

