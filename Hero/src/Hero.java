
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
public class Hero implements Prototype{
    private String name;
    private int lives;
    private int health;
    private ArrayList<Arms>weapons;
    //private Arms arms;


    public Hero(String name, int health, int lives) {
        this.name = name;
        this.health = health;
        this.lives = lives;
        this.weapons  = new ArrayList<>();
    }



  
    public void addArm(Arms arms){
        weapons.add(arms);
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Arms> getArm() {
        return weapons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArm(ArrayList<Arms> arm) {
        this.weapons = arm;
    }

    @Override
    public String toString() {
        return "Hero{" + "name=" + name + ", lives=" + lives + ", health=" + health + ", arm=" + weapons + '}';
    }
    
    
 //   public static ArrayList<Arms> arms(ArrayList<Arms>weapons){
  //      return weapons;
 //   }
    //
   
    @Override
    public Hero clone() {
//        Arms arms = new Arms(this.arms.getArmName(), this.arms.getSize());
      //arms(weapons);
        Hero hero = new Hero(name, health, lives);
       //ArrayList<Arms>armClone = new ArrayList<>();
       
    //   armClone.addAll(weapons);
  // ArrayList<Arms> armClone = (ArrayList<Arms>) weapons.clone();
  // armClone = weapons;
 //  armClone = (ArrayList<Arms>) weapons.clone();
  //   Collections.copy(this.weapons, armClone);
//   for (ArrayList<Float> item : data) {
        //  cloned.add(new ArrayList<Float>(item));
            
        for(Arms weapon : weapons){
              hero.addArm(weapon);
    }
         
        return hero;
    }

}

