/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonGenerics;

import java.util.Date;

/**
 *
 * @author Cube
 */
public class Main {
    public static void main(String[] args) {
        
        Cat cat = new Cat("Vasya", 5);
        Cat cat2 = new Cat("petya", 7);
        Date date = new Date();
        Client client = new Client(cat, date);
        
        client.method1();
        client.method2(cat);
        
         client.method2(date);
    }
    
}
