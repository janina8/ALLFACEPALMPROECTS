/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devices;

/**
 *
 * @author Cube
 */
public abstract class CommunicationDevices extends Devices {
    
    private Display display;
    
    private int battary;
    
    private String internet;
    private KeyBoard_1 keyBoard;

    public String getInternet() {
        return internet;
    }

      public CommunicationDevices() {
        this.display = display;
        this.battary = battary;
        this.internet = internet;
    }


    public int getBattary() {
        return battary;
    }
    
    public void increaceBattary(){
        
    }
    
    public void deCreaceNattary(){
        
    }

    public void setKeyBoard(KeyBoard_1 keyBoard) {
        this.keyBoard = keyBoard;
    }

  
    
    
}
