/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Cube
 */
public class Main1 {
    
    public static void main(String[] args) {
        
         ArrayList<Person> listPerson = new ArrayList<>();
        Adress adress = new Adress("ulica Pushkina", 1);

        Adress adress2 = new Adress("улица Колотушкина", 9);
        Adress adress3 = new Adress("А улица Ленина", 44);
        Adress adress4 = new Adress("улица Путина", 3);
        Adress adress5 = new Adress("Б улица Курочкина", 4);

        Person person = new Person("Vasja", "Petrov", 301.111, new Date(2040 - 1900, 05, 15), 33, adress, true);
        Person person2 = new Person("Петя", "Петров", 302.111, new Date(2004 - 1900, 04, 13), 33, adress2, true);
        Person person3 = new Person("АВаля", "Вальевна", 306.111, new Date(2030 - 1900, 02, 42), 48, adress3, false);
        Person person4 = new Person("Кура", "Курьевна", 308.111, new Date(2002 - 1900, 04, 32), 31, adress4, true);
        Person person5 = new Person("Куринная", "Курина", 309.111, new Date(1900 - 1900, 01, 22), 13, adress5, false);

        Collections.addAll(listPerson, person, person2, person3, person4, person5);
        Collections.sort(listPerson);
       //  Collections.reverse(listPerson);
        for(Person a: listPerson){
        System.err.println(a);
        }
    }
}
