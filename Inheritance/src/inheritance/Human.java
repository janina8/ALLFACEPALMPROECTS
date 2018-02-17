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
public class Human {
    
    protected String name;
    private String country;
    private String gender;
    
    
    public void eat(){
        System.out.println("human is eating");
    }
    
    public void sleep(){
        
    }

    public String getName() {
        return name;
    }
    
    public void drink(){
        
    }
    
    public void breath() {
        
    }

    public Human(String name, String country, String gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
    }
    
}
