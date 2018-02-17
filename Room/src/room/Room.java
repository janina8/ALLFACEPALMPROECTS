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
public class Room {
    
     private int termo;
   
     
     
   private Termodetector termodetector;          
   private Speaker speaker;
   private Controller controller;
    
   public void chengeTermo(int value) {
       termo = termo+value;
       termodetector.transferTermo(termo);
      // termodetector.setTermo(5); ///можно ли так приьавить к настоящему значению?
     //  this.getTermo ///?
       
   }
   
    public Room() {
        this.speaker = new Speaker();
        this.controller = new Controller(speaker);
        this.termodetector = new Termodetector(controller);
        this.termo = 18;
    }

}
