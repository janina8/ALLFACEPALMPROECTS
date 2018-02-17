/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer1;

import java.util.Objects;

/**
 *
 * @author Cube
 */
public class Monitor {
    
    private String name;
    
    private boolean monitorIsOn;

    public Monitor(boolean monitorIsOn) {
        this.monitorIsOn = monitorIsOn;
    }
    
    
    
    public void monitorOn() {
        this.monitorIsOn = true;
    }
    
    public void monitorOff() {
        this.monitorIsOn = false;
    }
    
    public void show(String info) {
        if (monitorIsOn) {
            System.out.println(info);
        } else {
            System.out.println("Monitor id Off");
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Monitor other = (Monitor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
