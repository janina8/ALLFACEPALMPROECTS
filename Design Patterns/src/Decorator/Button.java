/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Cube
 */
public class Button implements IWidget {

    @Override
    public void drow() {
        System.out.println("Кнопка нарисована.");
    }
    
}
