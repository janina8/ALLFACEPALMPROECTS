
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Trump implements Cloneable{
    
    private int moneyCount;
    //Object
    private int IQ;
    
    private ArrayList<String> privacy;

    public Trump() {
        this.moneyCount = 1000;
        this.IQ = -120;
        this.privacy = new ArrayList<>();
        Collections.addAll(privacy, "TrumpTown", "TrumpIsland","TrumpHouses");
    }
    
    @Override
    public Trump clone(){
        
        Trump trump = new Trump();
        return trump;
        
    }

    @Override
    public String toString() {
        return "Trump{" + "moneyCount=" + moneyCount + ", IQ=" + IQ + ", privacy=" + privacy + '}';
    }
    
    
}
