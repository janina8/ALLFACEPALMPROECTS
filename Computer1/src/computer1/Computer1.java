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
public class Computer1 {
    
    private SystemBox systemBox;
    private Monitor monitor;
    private boolean computerIsOn;
    private Keyboard keyboard;
    private Printer printer;
    private String text;
    String printout;

    
    public Computer1 (Printer printer){
        this.systemBox = new SystemBox(computerIsOn, printer);
        this.monitor = new Monitor(computerIsOn);
        
        this.keyboard = new Keyboard(computerIsOn);
        systemBox.setKeyboard(keyboard);
        this.printer = printer;
    }
    
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
    
    
    public void on() {
        this.computerIsOn = true;

        systemBox.systemBoxOn();

        monitor.monitorOn();

        keyboard.swichOn();

        printer.printerOn();

 
    }
    
    public void off() {
          systemBox.systemBoxOff();
          monitor.monitorOff();
          keyboard.swichOff();
          printer.printerIsOff();
        
    }
   
    
    public void writeSomething(){
        this.text = keyboard.write();
  //      systemBox.printSomething(keyboard.write());
        
        
    }
     
    
    public void printOnprinter() {
        systemBox.printSomething(text);
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        if (!(obj instanceof Computer1)) {
            return false;
        }
        final Computer1 other = (Computer1) obj;
        if (!this.systemBox.equals(other.getSystemBox())) {
            return false;
        }
        if (!Objects.equals(this.monitor, other.monitor)) {
            return false;
        }
        if (!Objects.equals(this.keyboard, other.keyboard)) {
            return false;
        }
        return true;
    }

    public SystemBox getSystemBox() {
        return systemBox;
    }
    
    
    
    
}
