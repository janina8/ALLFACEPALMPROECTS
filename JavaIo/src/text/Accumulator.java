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
public class Accumulator {
    
    private int capasity;

    public Accumulator(int capasity) {
        this.capasity = capasity;
    }

    @Override
    public String toString() {
        return "Accumulator " + capasity;
    }
    
    
    
}
