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
public class Passangere {
    private Person person;
    private double price;
    private int worksTime;
    
     public void flying(){
        System.out.println(person.getName()+"Летить в самолете до: "+worksTime);
    }

    public Passangere(Person person, double price, int worksTime) {
        this.person = person;
        this.price = price;
        this.worksTime = worksTime;
    }
       public void setPerson(Person person) {
        this.person = person;
    }
    
}
