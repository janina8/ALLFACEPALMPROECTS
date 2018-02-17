/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Stewardess implements Viewer{

    private String name;
    @Override
    public void clap() {
        
        System.out.println("Сейчас похлопал: "+ getClass().getName()+ name);
      
    }

    public Stewardess(String name) {
        this.name = name;
    }
    
    
}
    

