/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testExeption;

/**
 *
 * @author Cube
 */
public class Head {

    private Brain brain;
    private String color1;
    private Boolean isHealth = true;
    private Pishevod pishevod;

    public Head(String color1, Pishevod pishevod) {
        this.brain = new Brain();
        this.color1 = color1;
        this.pishevod = pishevod;

        brain.setHead(this);
    }

    public void eat(String food) {
        System.out.println("Пища влезла в рот");

        try {
            pishevod.transfer(food);
        } catch (ExceptionInInitializerError e) {
            brain.deleteEat();
          

        }

    }

    public Brain getBrain() {
        return brain;
    }

    public String getColor1() {
        return color1;
    }

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
        System.out.println("Щас вырвет" + " а голова то уже красная " + this.color1);
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

}
