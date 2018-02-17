/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer1;

/**
 *
 * @author Cube
 */
public class Printer {
    
    private boolean printerIsOn;
   
   
   

  /*  public void setPrintout(String printout) {
        this.printout = printout;
    } */

    public Printer(boolean printerIsOn) {
        this.printerIsOn = printerIsOn;
        
        
    }
    
    
    
    
     public void printerOn() {
        this.printerIsOn = true;
        
        
        
    }
    
    public void printerIsOff() {
        this.printerIsOn = false;
       
    }
    
    
    public void print(String text){
        if(printerIsOn) {
         
            System.out.println("Вы распечатали: " + text);
        }
       
    }
    
}
