/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Pilot implements Viewer {

private String name;
    @Override
    public void clap() {
        
        System.out.println("Сейчас похлопал: "+ getClass().getName()+ name);
      
    }

    public Pilot(String name) {
        this.name = name;
    }
    
    
}

