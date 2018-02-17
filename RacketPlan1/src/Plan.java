/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Plan {
    private boolean isButtonOn;
    private Racket racket;

    public Plan(Racket racket) {
        this.racket = racket;
    }

    public void setRacket(Racket racket) {
        this.racket = racket;
    }
    
    public void startRacket() {
        if(racket != null){
            racket.start();
            racket = null;
        }
        else
            System.out.println("Is inposible to start rocket !");
    }
    
}
