/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

/**
 *
 * @author Cube
 */
public class Compressor {
    
    private Display display;
    private Mangetta mangetta;
    
   public Compressor(Display display) {
        this.display = display;
    }

    public void setMangetta(Mangetta mangetta) {
        this.mangetta = mangetta;
    }
    
    public boolean pressure(){
        display.show("compressor is preassure");
        mangetta.addPreassure();
        return true;
        
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

 
}
