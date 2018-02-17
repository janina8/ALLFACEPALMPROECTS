/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPhone;

import java.io.Serializable;

/**
 *
 * @author Cube
 */
public class Accumulator implements Serializable {

    private int maxCapacity;
    private int minCapacity;
    private int currentCapacity;

    public int dischardge(int value) {
        if ((currentCapacity - value) >= minCapacity) {
            return currentCapacity -= value;
        } else {
            return 0;
        }
    }

    public int chardge() {
        currentCapacity = maxCapacity;
        return currentCapacity;
    }

    public Accumulator(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = maxCapacity / 10;
        this.currentCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    @Override
    public String toString() {
        return "Accumulator{" + "maxCapacity=" + maxCapacity + ", minCapacity=" + minCapacity + ", currentCapacity=" + currentCapacity + '}';
    }

}
