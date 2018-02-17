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
public class Phone extends Technic {
    private Accumulator accumulator;
    private Sim sim;
    
    
    public Phone(int number, String type, String brand, double price, String description, boolean isInStock, Sim sim) {
        super(number, type, brand, price, description, isInStock);
                this.accumulator = new Accumulator(20);
                this.sim = sim;

    }

    @Override
    public String toString() {
        return "Phone " + sim + super.toString();
    }
    
}
