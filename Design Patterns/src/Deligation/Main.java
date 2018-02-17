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
public class Main {
    
    public static void main(String[] args) {
        
        Person person = new Person("Настя", "25", 8);
        Person person2 = new Person("Петя", "35", 9);
        Person person3 = new Person("Миша", "45", 15);

        Manager manager = new Manager(person, 0, 0);
        Manager manager2 = new Manager(person2, 0, 0);
        Manager manager3 = new Manager(person3, 0, 0);

        Passangere passangere = new Passangere(person, 500, 0);
        Pilot pilot = new Pilot(person2, 1000, 24);
        Pilot pilot2 = new Pilot(person3, 800, 23);

        Stewardess stewardess = new Stewardess(person, 30, 4);
        Stewardess stewardess2 = new Stewardess(person3, 10, 2);
        
        Reception reception = new Reception(person3, 100, 3);
        
        reception.coll();
        pilot.fly();
        pilot2.fly();
        
        manager2 = null;
        
        pilot.setPerson(null);
        pilot.fly();
        reception.setPerson(person3);
        reception.coll();

    }

}
