/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class RemoteControl {
    
    private Device[] devices;
    
    private Device selectedDevice;

    public RemoteControl() {
         devices = new Device [3];
         devices[0] = new Device(false, "conditioner", 10);
         devices[1] = new Device (false, "heater");
         devices[2] = new Device (false, "dryer");
    }
    
    public void changeDevice(String name){
        
        switch(name){
            case "cond" :
                selectedDevice = devices[0] ;
                break;
            case "heat"  :
                selectedDevice = devices[1];
                break;
            case "dry" :
                selectedDevice = devices[2];
                break;
        }
     
    }

    public void increase() {
        selectedDevice.increaceTermo();
       

    }

    public void decrease() {
        selectedDevice.dicreaceTermo();

    }

    
}





