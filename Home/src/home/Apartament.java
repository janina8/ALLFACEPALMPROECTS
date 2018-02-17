/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author Cube
 */
public class Apartament {
    
    private Speaker speaker;
    
    private int number;

    Apartament(int i) {
       this.number = i;
       this.speaker = new Speaker();
    }

    @Override
    public String toString() {
        return "Apartament{" + "number=" + number + '}';
    }

    public int getNumber() {
        return number;
    }

   public void speakerCall() throws ReturnExeprion {
       speaker.speak(this);
    }

    
}
