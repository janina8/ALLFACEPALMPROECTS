/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author Cube
 */
public class Flat {
    
    private int flatNumber;
    private Speaker speaker;

    public int getFlatNumber() {
        return flatNumber;
    }

    public Flat(int flatNumber) {
        this.speaker = new Speaker();
    }
    
   public void speakerOn(){
       speaker.speak(flatNumber);
   }
    
}
