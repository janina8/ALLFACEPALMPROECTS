/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boxtest;

/**
 *
 * @author Cube
 */
public class TextClass {
 
    
    private String text;
    
    private int number;

    public TextClass(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TextClass{" + "text=" + text + ", number=" + number + '}';
    }

 
    
    
}
