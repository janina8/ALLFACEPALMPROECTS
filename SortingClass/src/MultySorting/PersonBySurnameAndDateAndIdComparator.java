/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultySorting;

import java.util.Comparator;

/**
 *
 * @author Cube
 */
public class PersonBySurnameAndDateAndIdComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getSurname().compareTo(o2.getSurname());
        if (result != 0) {
            return result;
        }

        result = o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        if (result != 0) {
            return result;
        }
        return Integer.compare(o1.getId(), o2.getId());

    }
}
