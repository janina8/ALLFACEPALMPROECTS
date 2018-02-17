/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Date;

/**
 *
 * @author Cube
 */
public class Person {
    
    private String name;
    private int id;
    private String surname;
    private Date DateOfBirdth;
    private double salary;
    private boolean isMarried;

    public Person(String name, int id, String surname, Date DateOfBirdth, double salary, boolean isMarried) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.DateOfBirdth = DateOfBirdth;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirdth() {
        return DateOfBirdth;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", surname=" + surname + ", DateOfBirdth=" + DateOfBirdth + ", salary=" + salary + ", isMarried=" + isMarried + '}';
    }
    
    
    
}
