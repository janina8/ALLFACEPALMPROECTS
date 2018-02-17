/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonGenerics;

/**
 *
 * @author Cube
 */
public class Client {
    private Object field1;
    private Object field2;

    public Client(Object field1, Object field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
    
    public void method1(){
        System.out.println(field1);
    }
    
    public void method2(Object object){
        if (object instanceof Cat){
         Cat cat = (Cat)object;
                 cat.miau();
        }
        else {
            System.out.println("не мяукают такие объекты.");
        }
                
    }
    public Object method(Object value1, Object value2){
        return value1;
    }
}
