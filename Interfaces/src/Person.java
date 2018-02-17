/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Person extends Human {
    
    private int id;
  

    public Person(String name, int id) {
        super(name);
        this.id = id;
    }
    
    public void vote(){
        System.out.println(getName()+id+"is voted");
    }

    public int getId() {
        return id;
    }


    
}
