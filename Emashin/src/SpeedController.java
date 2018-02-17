
import static java.awt.SystemColor.info;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cube
 */
public class SpeedController {

    //private Car car;
    private int maxSpeed;
    //private int currentSpeed;
    private Display display;
    private boolean benzin;

    public SpeedController(int maxSpeed, boolean benzin) {
        this.maxSpeed = maxSpeed;
        this.display = new Display();
         this.benzin = benzin;

    }

    public void speedControll(int currentSpeed) {
       display.show("Вы завели машину. Машина разгоняется до скорости: " +currentSpeed);

        if (benzin == false) {
            throw new ExceptionInInitializerError();

        }
        try {

            if (currentSpeed > maxSpeed) {
                currentSpeed = 132;

                display.show("Вы превысили максмально возможную скорость: " + maxSpeed + " Скорость снижена до: " + currentSpeed);
            } else {

//                display.show("Машина поехала со скоростью: " + currentSpeed);
            }
        } catch (ExceptionInInitializerError e) {
            display.show("Нет бензина!");

        }

    }
}
