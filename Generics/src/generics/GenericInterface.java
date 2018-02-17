/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Cube
 */
public interface GenericInterface<T extends Dog, V, A>{
    
    void method();
    T method2();
    V method3(T t);
    
}
