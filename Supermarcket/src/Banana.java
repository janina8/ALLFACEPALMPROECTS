/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Banana extends Food{

    public Banana(int uglevodi, String name, int price) {
        super(uglevodi, name, price);
    }

    @Override
    public String toString() {
        return "Banana" + ' '+super.toString();
    }
    
    
}
