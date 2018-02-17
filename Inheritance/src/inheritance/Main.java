/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.ArrayList;

/**
 *
 * @author Cube
 */
public class Main {
    
    
    public static void main(String[] args){
        Adress adress = new Adress("Latvia", "Pushkina", 50);
        Student student = new Student("LU", 7575, adress, 012, "Petya", "Latvia", "male");
        Human human = new Human("Vasilij", "Russia", "Male");
        Person person = new Person(adress, 4, "Kokoko", "???", "?");
        
        student.study();
        
        student.eat();
        human.eat();
        person.eat();
        //adress.
        
        
        //Student s1 = new Person(adress, 4, "fff", "ffff", "fff");
     
        
        //Person person1 = new Human("V", "f", "ff");
        Person p1; //= new Student("LU", 7575, adress, 012, "Sasha", "Latvia", "male");
        p1 = student;
        System.out.println(p1.getName());
        Student s5 = (Student)p1;
        Human s6 = (Human)person;
        s6.eat();
        System.out.println(s5.getName());
        ArrayList<Human> people = new ArrayList<>();
        people.add(student);
        people.add(p1);
        for(Human h : people)
            System.out.println(h.getName());
        System.out.println(person.toString());
        System.out.println(student);
    }
}
