/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultySorting;

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
        Adress adress4 = new Adress("Pushkina", 5);
        Adress adress5 = new Adress("Pushkina", 2);
        Person person = new Person("Вася", "Петрочвич", 1212.1111, new Date(2041 - 1900, 05, 5), 53434, adress, true);
        Person person2 = new Person("Кура", "Курьевна", 1212.1111, new Date(2060 - 1900, 05, 05), 43434, adress2, true);
        Person person3 = new Person("Кура", "Курьевна", 5212.1111, new Date(2040 - 1900, 05, 11), 43434, adress3, true);
        Person person4 = new Person("Василиса", "Петрович", 1212.1111, new Date(2060 - 1900, 05, 05), 43434, adress5, true);
        Person person5 = new Person("Оля", "Кококо", 1212.1111, new Date(2040 - 1900, 05, 11), 43434, adress4, true);
        Person person6 = new Person("Оля", "Кококо", 1212.1111, new Date(2040 - 1900, 05, 11), 4004, adress4, false);

        ArrayList<Person> persons = new ArrayList<>();
        Collections.addAll(persons, person, person2, person3, person4, person5, person6);
        Collections.sort(persons);

        //    for(Person a:persons){
        //        System.out.println(a);
        //   }
        for (Person a : persons) {
            System.out.println(a);
        }
        Collections.sort(persons, new PersonByNameAndSalaryComparator());
        for (Person a : persons) {
            System.out.println(a);
        }
    }
}
