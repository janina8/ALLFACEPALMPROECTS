/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Brain {
    
    private Stomack stomack;
    private Mouth mouth;

    public void perceive() {

      
            mouth.salivate();

            System.out.println("I whant to eat");

        

    }

    public void setStomack(Stomack stomack) {
        this.stomack = stomack;
    }

    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }
}

