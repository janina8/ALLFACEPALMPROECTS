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
public class Generic <T extends Cat, V extends Dog>{
    
    public V orat(T animal){
        animal.miau();
        Dog dog = null;
    return (V) dog;
   
}
}