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
public class ShadeDecorator extends WigetDecorator {
    
    private String color;
    private int prozrachnost;
    
    
    public ShadeDecorator(IWidget iWidget, String color, int prozrachnostj) {
        super(iWidget);
        this.color = color;
        this.prozrachnost = prozrachnostj;
    }
    
    @Override
    public void drow(){
      super.drow();
        System.out.println("Нарисовали тень с прозрачностью "+prozrachnost);
    
    }
    
}
