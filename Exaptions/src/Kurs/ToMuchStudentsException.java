/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kurs;

/**
 *
 * @author Cube
 */
public class ToMuchStudentsException extends Exception{

    public ToMuchStudentsException() {
        super("Слишком много студентов.");
    }
    
    
    
}
