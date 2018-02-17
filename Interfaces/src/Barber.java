/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Barber extends Person implements Musician {
    
    public void cutHair(){
        System.err.println(getName()+"is cut hair");
    }

    public Barber(String name, int id) {
        super(name, id);
    }

    @Override
    public void play() {
         System.out.println(getName()+" " +getClass().getName()+"is playng");
    }


}

