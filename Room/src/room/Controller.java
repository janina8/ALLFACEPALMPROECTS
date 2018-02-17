/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;

/**
 *
 * @author Cube
 */
public class Controller {
    
    private Termodetector termodetector;
    private Speaker speaker;
    //Termodetector termodetector = new Termodetector(20);
    
    
    

    public Controller(Speaker speaker) {
        this.speaker = speaker;
    }
    
    public void analize(int value) {
        if(value > 50){
            speaker.speak();
            System.out.println("controller analize termo: "+ value);
        }
            else {
                    System.out.println("Termo is normal: "+ value);
                    }
        }
    
            
}
