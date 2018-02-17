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
public class Phone implements Serializable{
    private String brand;
    private Accumulator accumulator;
    private Display display;
    private Sim sim;
    
    public Phone(String brand, int maxCapacity){
        this.brand = brand;
        this.accumulator = new Accumulator(maxCapacity);
        this.display = new Display();
    }

    public Phone(Accumulator accumulator, Display display, Sim sim) {
        this.accumulator = accumulator;
        this.display = display;
        this.sim = sim;
    }
    
    

    public void setSim(Sim sim) {
        this.sim = sim;
    }
    public void call(String number){
        if (sim!=null) {
           display.show(sim.connect(number));
           display.show("Accumulator show: "+accumulator.dischardge(15));
        }
        else {
            display.show("No sim");
        }
    }

    public void setAccumulator(Accumulator accumulator) {
        this.accumulator = accumulator;
    }
    
    
    
    public void chardgeAccumulator() {
        accumulator.chardge();
    }

    public String getBrand() {
        return brand;
    }

    public Accumulator getAccumulator() {
        return accumulator;
    }

    public Display getDisplay() {
        return display;
    }

    public Sim getSim() {
        return sim;
    }

    @Override
    public String toString() {
        return "Phone{" + "brand=" + brand + ", accumulator=" + accumulator + ", display=" + display + ", sim=" + sim + '}';
    }
    
    
}
