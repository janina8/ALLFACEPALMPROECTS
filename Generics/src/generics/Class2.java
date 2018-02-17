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
public class Class2<Z, A>implements Generic2<Z, Z>{

    @Override
    public <A, C> A action2(C c) {
        System.out.println(c);
        return (A) c;
    }
    
}
