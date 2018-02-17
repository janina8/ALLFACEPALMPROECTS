
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class MusicBand {
    
    private ArrayList<Musician>list = new ArrayList<>();
    
    public void addMusician(Musician musician){
        list.add(musician);
        
    }
   
    public void performe() {

        for (Musician a : list) {
           a.play();
        }
    }
}
