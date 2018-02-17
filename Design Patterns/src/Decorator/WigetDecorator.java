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
public abstract class WigetDecorator implements IWidget {
    private IWidget iWidget;

    @Override
    public void drow() {
        iWidget.drow();
    }

    public WigetDecorator(IWidget iWidget) {
        this.iWidget = iWidget;
    }
    
    public void setWidget(IWidget widget){
        this.iWidget = widget;
        
    }
    
}
