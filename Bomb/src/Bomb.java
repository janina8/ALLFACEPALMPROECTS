/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Bomb {

    private Keyboard keyboard;
    private int timer;

    public Bomb(Keyboard keyboard) {
        this.keyboard = keyboard;
        
    }
    private boolean bombOn = true;

    public void bombOff() {

        this.bombOn = false;
        System.out.println("Bomb is OFF");
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void start() {

        if (timer > 10) {
            for (int i = timer; i > 0; i--) {
                System.out.println("Время до взрыва бомбы:" + i);
            }

            System.out.println("Бомба взорвалась, вы умираете.");
        } else {
            System.out.println("Bы не установили таймер.");
        }

    }
}
