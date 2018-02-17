
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
public class Car {

    private SpeedController speedController;


    private int currentSpeed;
    // private SpeedController speedController;
    private JTextArea jTextArea1;
 
   

    public void go(int currentSpeed) {
        

       
        speedController.speedControll(currentSpeed);

    }

    public Car(JTextArea jTextArea1) {
        this.speedController = new SpeedController(100, true, jTextArea1);
     
    

    }
    
    //добавить дисплей и форму сделать 

}
