/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

/**
 *
 * @author Cube
 */
public class Mangetta {
    private Arm arm;
    private Tonometr tonometr;
    
    public void put(Arm arm) {
        this.arm = arm;
    }

    public void setTonometr(Tonometr tonometr) {
        this.tonometr = tonometr;
    }
    
    public void addPreassure() {
        if (arm != null) {
           int pressure1 =  arm.getPreassure1();
            int pressure2 =  arm.getPreassure2();
             int pulse =  arm.getPulse();
           tonometr.receive(pressure1, pressure2, pulse);
        }
    }
}
