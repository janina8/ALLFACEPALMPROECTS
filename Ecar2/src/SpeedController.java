
import static java.awt.SystemColor.info;
import javax.swing.JTextArea;

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
    
    private boolean benzin;
    
   private JTextArea jTextArea1;
  //  jTextArea1.append();

    public SpeedController(int maxSpeed, boolean benzin, JTextArea jTextArea1) {
        this.maxSpeed = maxSpeed;
      //  this.display = new Display();
         this.benzin = benzin;
         this.jTextArea1 = jTextArea1;

    }

    public void speedControll(int currentSpeed) {
       jTextArea1.append("Вы завели машину. Машина разгоняется до скорости: " +currentSpeed+"\n");

        if (benzin == false) {
            throw new ExceptionInInitializerError();

        }
        try {

            if (currentSpeed > maxSpeed) {
                currentSpeed = 132;

        jTextArea1.append("Вы превысили максмально возможную скорость:" + maxSpeed +"\n"+ " Скорость снижена до: " + currentSpeed);
            } else {

        jTextArea1.append("Машина поехала со скоростью: " + currentSpeed);
            }
         } catch (ExceptionInInitializerError e) {
         jTextArea1.append("Нет бензина!");

        }

    }
}
