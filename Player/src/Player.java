/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Player {

    private boolean on;

    private Display display;
    private Accumulator accumulator;
    private MemoryCard memoryCard;

    public Player(Display display, Accumulator accumulator, MemoryCard memoryCard) {
        this.display = new Display();
        this.accumulator = accumulator;
        this.memoryCard = memoryCard;
    }

    public void playMucis() {
        if (memoryCard != null && accumulator.getCurrentCapacity() > accumulator.getMinCapacity() && on == true) {
            display.show("Now playing The Song: " + memoryCard.getTheFirsrtSong() + " Your current capacity is: " + accumulator.getCurrentCapacity());
            dischardgeAccumulator();
        }
        
        else {
            display.show("Заряди плеер или вставь карту памяти.");
          isOff();
        }
    }

    
    public void isOn() {
        this.on = true;
        display.show("Player is On");
    }

    public void isOff() {
        this.on = false;
        display.show("Player is off");
    }

    public void chardgeAccumulator() {
        accumulator.chardge();
        display.show("Your accumulator is charegde");
        isOn();
    }

    public void dischardgeAccumulator() {
        accumulator.dischardge(1);
        display.show("Заряд уменьшился до: " +accumulator.getCurrentCapacity());
        if (accumulator.getCurrentCapacity() == 0) {
            display.show("Your accumulator is discharegde");
        }
    }
}
