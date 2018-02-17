/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {
    public static void main(String[] args) {
        
        Racket racket = new Racket();
        Plan plan = new Plan (racket);
        
        plan.startRacket();
        plan.startRacket();
        Racket racket1 = new Racket();
        plan.setRacket(racket1);
        plan.startRacket();
    }
}
