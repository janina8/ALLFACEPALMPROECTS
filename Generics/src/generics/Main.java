/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.Date;
import java.util.function.DoubleSupplier;
import nonGenerics.Cat;
import nonGenerics.Tiger;

/**
 *
 * @author Cube
 */
public class Main {
    public static void main(String[] args) {
        
        Cat  cat = new Cat("Petya", 3);
          Cat  cat2 = new Cat("Vasya", 3);
        Client<Cat> client = new Client<>(cat);
        Client<Tiger> client2 = new Client<>(new Tiger("f", 1));
        Generic<Cat, Dog> generic1 = new Generic<>();
        
        Dog dog = generic1.orat(cat);
        System.out.println(dog);
        client.method1();
      //  Date date = new Date();
        
      //   Client<Date>client2 = new Client<>(date);
      //   client2.method2();
      
     
        
    }
}
