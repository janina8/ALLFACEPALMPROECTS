/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showsomthing;

/**
 *
 * @author Cube
 */
public class Cow implements USB{
    private String name;
    private int ves;

    @Override
    public String info() {
          return name+" "+ ves;
    }

    public Cow(String name, int ves) {
        this.name = name;
        this.ves = ves;
    }
    
    
    
}
