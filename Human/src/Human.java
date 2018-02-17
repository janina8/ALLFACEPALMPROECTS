/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Human {



    private int energy;

    private Brain brain;
    private Stomack stomack;
    private Mouth mouth;

    public Human() {
        this.brain = new Brain();
        this.stomack = new Stomack();
        brain.setStomack(stomack);
        stomack.setBrain(brain);
        this.mouth = new Mouth();
        brain.setMouth(mouth);
        this.energy = 5;
    }
    
    public void eat(int food) {

        energy = energy + food;

        System.out.println("Your energy is: " + energy);
    }

    

    public void walk() {
        if (energy > 1) {

            energy = energy - 1;
            System.out.println("You walk... Your energy is: " + energy);
        } 
        else {
            stomack.juice();
            System.out.println("Your energy is: " + energy);
        }

    }


    public void think() {
        if (energy >= 3) {
            System.out.println("I want to walk!");
        }
        if (energy <= 2) {       //????
            brain.perceive();
            mouth.salivate();
       } else if (energy <= 0) {
            System.out.println("I go to sleep");
        } 
    }   

}
