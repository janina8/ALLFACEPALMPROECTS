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
public class Client <T extends Cat>{
    private T field1;

    public Client(T field1) {
        this.field1 = field1;
    }

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }
    
    
    public void method1(T a){
        
        a.miau();
    }
    public void method1(){
        System.out.println(field1);
    }
    public <A, B> A action(B b){
        return (A) b;
        
    }
}
