/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Cube
 */
public class Main {

    public static void main(String[] args) {

        Adress adress = new Adress("Pushkina", 1);
        Adress adress2 = new Adress("Pushkina", 5);
        Adress adress3 = new Adress("Pushkina", 2);
        Person person = new Person("Vasja", "Petrovich", 1212.1111, new Date(2041 - 1900, 05, 5), 43434, adress, true);
        Person person2 = new Person("Kolja", "Petrovich", 1212.1111, new Date(2060 - 1900, 05, 05), 43434, adress2, true);
        Person person3 = new Person("Kura", "Petrovich", 1212.1111, new Date(2040 - 1900, 05, 11), 43434, adress3, true);
        
        ArrayList<Person> persons= new ArrayList<>();
        Collections.addAll(persons, person,person2,person3);
        Collections.sort(persons, new PersonByHouseNumberComparator());
                
    //    for(Person a:persons){
    //        System.out.println(a);
     //   }
           Collections.sort(persons, new PersonByDateComparator());
             for(Person a:persons){
            System.out.println(a);
        }
                Collections.sort(persons, new PersonByNameComparator());
             for(Person a:persons){
            System.out.println(a);
        } 
             
    }
    
}
