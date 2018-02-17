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
public class Arm {

private int preassure1;
private int preassure2;
private int pulse;


 public Arm(int preassure1, int preassure2, int pulse) {
        this.preassure1 = preassure1;
        this.preassure2 = preassure2;
        this.pulse = pulse;
    }


    public int getPreassure1() {
        return preassure1;
    }

    public int getPreassure2() {
        return preassure2;
    }

    public int getPulse() {
        return pulse;
    }
   
    
}
