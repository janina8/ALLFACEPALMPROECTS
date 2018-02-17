/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

/**
 *
 * @author Cube
 */
public class Computer {
    
    private Printer currentPrint;
    
    public void printSomthing(String info){
        
        currentPrint.print(info);
    }

    public void setCurrentPrint(Printer currentPrint) {
        this.currentPrint = currentPrint;
    }

    
    
    
}
