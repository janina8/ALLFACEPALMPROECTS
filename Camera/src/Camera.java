/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Camera {

    private Battery battery;

    private MemoryCard memoryCard;

    private Objective objective;

  

    public Camera(Battery battery, MemoryCard memoryCard, Objective objective) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.objective = objective;
       

    }

    public void photo() {

        if (memoryCard.memorySize != 0 & battery.getCharge() != 0) {
            System.out.println("Вы сделали снимок с зумом " + objective.zoom);

            battery.discharge(10);
            System.out.println("Ваш заряд батарии составляет:" + battery.getCharge());

            memoryCard.cardWriten();
           
        } else {
            System.out.println("can not take photo");
        }

    }
    public void cameraRecharge(){
        battery.recharge();
    }

}

/* public void recharge() {
        if (powerSocket.powerSocketIsOn = true) {
            battery.charge = 100;
        }
 */
