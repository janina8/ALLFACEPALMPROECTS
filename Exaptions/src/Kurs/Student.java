/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kurs;

/**
 *
 * @author Cube
 */
public class Student {

    private String name;
    

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + '}';
    }
    
    

}
