/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zip;

/**
 *
 * @author Cube
 */
public class Student extends Person{
    
    private String university;
    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" + "university=" + university + '}';
    }
    
}
