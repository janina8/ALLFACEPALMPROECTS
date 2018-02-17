/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import java.util.Comparator;

/**
 *
 * @author Cube
 */
public class PersonByDateComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
         
          
          return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }

}
