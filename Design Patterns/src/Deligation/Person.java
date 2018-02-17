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
public class Person {
    
    private String name;
    private String age;
    private int id;

    public Person(String name, String age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
    
    
    
}
