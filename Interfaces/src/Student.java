/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Student extends Person  implements Musician, Worcker, Sportsman{
    
    private String univercity;


    
    
    public void study(){
        System.out.println(getName()+getId()+ " is study in "+univercity);
    }

    public Student(String univercity, String name, int id) {
        super(name, id);
        this.univercity = univercity;
    }

    @Override
    public void play() {
        System.out.println(getName()+getClass()+"is playing");
    }

    @Override
    public void work() {
        System.out.println(getName()+getClass()+"is working");
    }

    @Override
    public void trains() {
        System.out.println(getName()+getClass()+" Тренеруется прямо сейчас, ого!");
    }
    
    
    
}
