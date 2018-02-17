
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class GullHouse {

    public static void main(String[] args) {
        Seagual[][] gullhouse = new Seagual[3][];
        gullhouse[0] = new Seagual[2];
        gullhouse[1] = new Seagual[6];
        gullhouse[2] = new Seagual[4];
        
        
        Seagual[][] birds = {{new Seagual(1), new Seagual(3)},
                              {new Seagual(1), new Seagual(3), new Seagual(4)},
                              {new Seagual(1), new Seagual(3), new Seagual(4), new Seagual(3), new Seagual(4)}
                            };
        for (int a = 0; a < gullhouse.length; a++) { // следущее прибавление не наступает до тех пор, пока полностью не выполнится внутренний цикл
            for (int i = 0; i < gullhouse[a].length; i++) {
                gullhouse[a][i] = new Seagual(12);
                System.out.print(gullhouse[a][i]+"\t");

            }
            System.out.println("");
        }
        double [] prices = {0.2, 54, 32.3};
        ArrayList<Double> prices2 = new ArrayList<>();
        prices2.add(new Double(25.3));
        
    }
}
