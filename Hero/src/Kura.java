/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Kura {
    
    private int size;
    private int weight;
    private String smale;
    private String voice;

    public Kura(int size, int weight, String smale, String voice) {
        this.size = size;
        this.weight = weight;
        this.smale = smale;
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Kura{" + "size=" + size + ", weight=" + weight + ", smale=" + smale + ", voice=" + voice + '}';
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getSmale() {
        return smale;
    }

    public String getVoice() {
        return voice;
    }
    
    
    public Kura(Kura original){
        this.size = original.getSize();
        this.weight = original.getWeight();
        this.smale = original.getSmale();
        this.voice = original.getVoice();
    }
    
}
