/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author Cube
 */
public class Sim {
    
    private String provider;

    public Sim(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return " Sim "+" "+provider+" ";
    }
    
    
}
