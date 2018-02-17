/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

/**
 *
 * @author Cube
 */
public abstract class WaterTransport extends Transport {
    
    private int deps;
    
    public void swim(){
        
    }

    public WaterTransport(int deps, String brand, int speed) {
        super(brand, speed);
        this.deps = deps;
    }

    public int getDeps() {
        return deps;
    }

    public void setDeps(int deps) {
        this.deps = deps;
    }
    
    
    
}
