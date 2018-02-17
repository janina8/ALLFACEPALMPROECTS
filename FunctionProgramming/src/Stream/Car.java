/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream;

/**
 *
 * @author Cube
 */
public class Car {
    
    private int km;

    public Car(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" + "km=" + km + '}';
    }
    
    
}
