/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deligation;

/**
 *
 * @author Cube
 */
public class Pilot {
    private Person person;
    private double salary;
    private int worksTime;
    
     public void fly(){
         if(person!=null){
        System.out.println(person.getName()+"Осуществляет полёт до: "+worksTime);
         }
         else
             System.out.println("Никого нет");
    }

    public Pilot(Person person, double salary, int worksTime) {
        this.person = person;
        this.salary = salary;
        this.worksTime = worksTime;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
 
}
