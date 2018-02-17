/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Accumulator accumulator = new Accumulator(10, 0, 4);
        Display display = new Display();
        MemoryCard memoryCard = new MemoryCard("Sacramentum Nocturnarum Nefarious Sacramentum Nocturnarum Nefarious Oremus Deus sanctus, deum filium");

        Player player = new Player(display, accumulator, memoryCard);
        player.isOff();

        player.isOn();
        player.playMucis();
        memoryCard.setTheFirsrtSong("La-la-la-la");
        memoryCard.setTheFirsrtSong("Новая песенка");
        player.playMucis();
        player.playMucis();
        player.playMucis();
        player.playMucis();
        player.playMucis();
        player.chardgeAccumulator();
        memoryCard.setTheFirsrtSong("La-la-la-la");
        player.playMucis();

    }

}
