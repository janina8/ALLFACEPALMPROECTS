/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Cube
 */
class DNA {
    
    
    private int hromasome;
    private int percentOfRace;

    public DNA(int hromasome, int percentOfRace) {
        this.hromasome = hromasome;
        this.percentOfRace = percentOfRace;
    }

    public void setHromasome(int hromasome) {
        this.hromasome = hromasome;
    }

    @Override
    public String toString() {
        return "DNA{" + "hromasome=" + hromasome + ", percentOfRace=" + percentOfRace + '}';
    }

    public int getPercentOfRace() {
        return percentOfRace;
    }

    public void setPercentOfRace(int percentOfRace) {
        this.percentOfRace = percentOfRace;
    }

    public int getHromasome() {
        return hromasome;
    }
    
    
}
