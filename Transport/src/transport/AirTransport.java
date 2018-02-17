package transport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public abstract class AirTransport extends Transport {
    
    private int high;

    public AirTransport(int high, String brand, int speed) {
        super(brand, speed);
        this.high = high;
    }
    
    
    
    public void fly(){
        System.out.println("Fly "+getHigh());
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
    
    
    
}
