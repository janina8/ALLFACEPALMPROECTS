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
   private  Display display;
 

    public void go(int currentSpeed) {
        

       
        speedController.speedControll(currentSpeed);

    }

    public Car() {
        this.speedController = new SpeedController(150, true);
     
    

    }
    
    //добавить дисплей и форму сделать 

}
