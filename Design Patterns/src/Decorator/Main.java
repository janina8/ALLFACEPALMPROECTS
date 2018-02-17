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
public class Main {

    public static void main(String[] args) {

        IWidget button = new Button();
        //   button.drow();
        IWidget textArea = new TextArea();
        IWidget comboBox = new ComboBox();

        IWidget borderDecorator = new BorderDecorator(textArea, "blue", 5);
        //    borderDecorator.drow();

        IWidget shadeDecorator = new ShadeDecorator(borderDecorator, "red", 10);
        //shadeDecorator.drow();
        //BorderDecorator s = new BorderDecorator(new ShadeDecorator(textArea, "red", 5), "green", 5);
        IWidget widget = new BorderDecorator(new BorderDecorator(new ShadeDecorator(textArea, "red", 5), "green", 5), "black", 6);
        //widget.drow();
       ( (WigetDecorator)borderDecorator).setWidget(button);
        borderDecorator.drow();
         
    }
}
