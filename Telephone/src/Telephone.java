/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Telephone {
    private String brand;
    private Accumulator accumulator;
    private Display display;
    private Sim sim;
    
    public Telephone(String brand, int maxCapacity){
        this.brand = brand;
        this.accumulator = new Accumulator(maxCapacity);
        this.display = new Display();
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
    
    public void chardgeAccumulator() {
        accumulator.chardge();
    }
}
