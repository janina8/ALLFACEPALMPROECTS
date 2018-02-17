/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samsungfactory;

/**
 *
 * @author Cube
 */
public class Display {
    
    
    private String info;
    private int size;
    
    public void show(String info){
        this.info = info;
        System.out.println(info);
    }

    public Display(int size) {
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    
}
