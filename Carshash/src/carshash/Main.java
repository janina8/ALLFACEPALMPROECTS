/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshash;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car = new Car(5,"bmv");
        Person person = new Person("Kura",30);
        Person person3 = new Person("Kura",30);
    
        
        
        Car car2 = new Car(6,"bmv2");
        Person person2 = new Person("Kura2",4);
        
        
        Parking carshash = new Parking();
        
        carshash.addCar(person2, car2);
        carshash.addCar(person, car);
        
        //System.out.println(carshash.toString());
        
       /* for (Objects objects : carshash) {
            System.out.println(objects);
        }*/

   //    System.out.println(carshash.takeCar(person3));
       carshash.print();
    }
    
}
