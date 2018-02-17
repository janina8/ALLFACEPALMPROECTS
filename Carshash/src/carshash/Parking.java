/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Cube
 */
public class Parking {
    
    private final Map<Person, Car> hashmap; 
    
    public void addCar(Person person, Car car){
        
        hashmap.put(person,car);
    }

  
    public Car takeCar(Person person){
        
        return hashmap.get(person);
    }
    public Parking() {
       
        this.hashmap = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Лист содержит:{" + "hashmap=" + hashmap + '}';
    }

    public void print(){
        //Set<Person> keys = hashmap.keySet();
        Collection<Car> cars = hashmap.values();
        for(Car car:cars){
            System.out.println(car);
        }
    }
  
   }
   
     
