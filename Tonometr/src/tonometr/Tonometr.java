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
public class Tonometr {
    private Compressor compressor;
    private Controller controller;
    private Display display;
    public Mangetta mangetta;

    public Tonometr() {
        this.display = new Display();
        this.controller = new Controller(display);
        this.compressor = new Compressor(display);
        //   this.controller.setDisplay(display);
    }
    public void setMangetta(Mangetta mangetta) {
        this.mangetta = mangetta;
        compressor.setMangetta(mangetta);
        mangetta.setTonometr(this);
    }
    public void start() {
        compressor.pressure();
    }
    public void receive(int pressure1, int pressure2, int pulse) {
        controller.analize(pressure1, pressure2, pulse);
    }
}
