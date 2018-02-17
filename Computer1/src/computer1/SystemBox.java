/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer1;

import java.util.Objects;

/**
 *
 * @author Cube
 */
public class SystemBox {
    
    private Keyboard keyBoard;
    
    private boolean systemBoxIsOn;
    
    private Printer printer;
    
    private Keyboard keyboard;
    
    private String name;
    
    
     public SystemBox(boolean systemBoxIsOn, Printer printer) {
       
        this.systemBoxIsOn = systemBoxIsOn;
        this.printer = printer;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
     
     
    
     public void systemBoxOn() {
         systemBoxIsOn = true;

    }
    
      public void systemBoxOff() {
         systemBoxIsOn = false;

    }
     
     
    public void printSomething(String text) {
        
        printer.print(text);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SystemBox other = (SystemBox) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

   
    
}
