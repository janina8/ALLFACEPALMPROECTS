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
public class BorderDecorator extends WigetDecorator{
    private String color;
    private int tolsina;
    
    
    public BorderDecorator(IWidget iWidget, String color, int tolsina) {
        super(iWidget);
        this.color = color;
        this.tolsina = tolsina;
    }
    
    
    @Override
    public void drow(){
        super.drow();
        System.out.println(createBorder());
        
    }
    private String createBorder(){
        return "Color бордера"+tolsina+"нарисована";
    }
}
