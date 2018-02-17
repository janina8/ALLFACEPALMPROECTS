/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;

/**
 *
 * @author Cube
 */
public class PersonByNameAndSalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result != 0) 
            return result;
        return Double.compare(o1.getSalary(), o2.getSalary());
    
            

      
    }
    

}