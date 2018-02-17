/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Date;

/**
 *
 * @author Cube
 */
public class Person {
     
    private String name;
    private String surname;
    private double salary;
    private Date dateOfBirth;
    private int id;
   // private Adress adress;
    private boolean isMarried;

    public Person(String name, String surname, double salary, Date dateOfBirth, int id, boolean isMarried) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    //    this.adress = adress;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

   // public Adress getAdress() {
     //   return adress;
  //  }

    public boolean isIsMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth + ", id=" + id + ", isMarried=" + isMarried + '}';
    }
    
    

 
}
