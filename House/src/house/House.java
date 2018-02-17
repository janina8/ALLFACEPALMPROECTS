/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.ArrayList;

/**
 *
 * @author Cube
 */
public class House {
    
    private ArrayList<Flat> flates;

    public House(int flatsCount) {
        this.pult = pult;
        this.speaker = speaker;
        this.flates = new ArrayList<Flat>();
        for(int i = 0; i<flatsCount; i++){
            Flat flat = new Flat(i);
            flates.add(flat);
        }
    }

   
    
    

    public void flates() {
        for (int i = 0; i < 10; i++) {
            flate.add(i);

        }
    }

    public House(Pult pult, Speaker speaker) {
        this.pult = pult;
        this.speaker = speaker;
    }

  
    

    public ArrayList<Integer> getFlate() {
        return flate;
    }
    

    public int callToFlate(int flatNumber) {
        
        for(int i = 0; i < flate.size();i++){
            Flat currentFlat = flate.get(i);
        }
            if(flate.get(i)== flatNumber){
                
                currentFlat.speakerOn();
            }
        }
    
    
}
