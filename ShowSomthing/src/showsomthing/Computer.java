/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showsomthing;

/**
 *
 * @author Cube
 */
public class Computer {


private Monitor monitor;

public void connect(USB usb){
    System.err.println("Вы подключили к компу ");
    monitor.show(usb);
    
}

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

   


}
