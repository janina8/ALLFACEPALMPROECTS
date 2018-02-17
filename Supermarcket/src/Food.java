/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public abstract class Food extends Product{
    
   private int uglevodi;

    public Food(int uglevodi, String name, int price) {
        super(name, price);
        this.uglevodi = uglevodi;
    }

    @Override
    public String toString() {
        return "Food" + " "+super.toString()+" "+"uglevodi " + uglevodi;
    }
   
    
}
