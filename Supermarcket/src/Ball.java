/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Ball extends Sport{
    
    public Ball(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Ball" + ' '+super.toString();
    }
    
}
