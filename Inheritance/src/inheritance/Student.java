/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Cube
 */
public class Student extends Person{
    
    private String university;
    
    private int studentId;
    
    
    public void study(){
        System.out.println("student is study");
        
    }

    public Student(String university, int studentId, Adress adress, long id, String name, String country, String gender) {
        super(adress, id, name, country, gender);
        this.university = university;
        this.studentId = studentId;
    }
    
    @Override
    public void eat(){
        System.out.println("student eating");
    }
    @Override
    public String toString(){
        return "I'm student My name is "+ name;
    }
    
}
