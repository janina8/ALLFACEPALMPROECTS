
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Seagual[] groap = new Seagual[10];
        
        groap[0] = new Seagual(15);
        
        Seagual [] seaguals = {new Seagual(12), new Seagual(10), null, new Seagual(14)};
        
        Seagual seagual1 = new Seagual(5);
         Seagual seagual2 = new Seagual(6);
         Seagual seagual3 = new Seagual(3);
      
         for(Seagual seagul:groap){
            
            seagul = new Seagual(12);
            seagul.cry();
        }
        
        ArrayList<Seagual>seagulls2 = new ArrayList<>();
        
        seagulls2.add(seagual1);
        seagulls2.add(seagual2);
        seagulls2.add(seagual3);
        
        Seagual [] mas = seagulls2.toArray(new Seagual[1]); //чтобы перевести из коллекции в массив надо передать в аргументах любой массив с нужными типами
         int a = 1;
        int b = 0;
        int c = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println(c + " ,");
            c = a + b;
            b = a;
            a = c;

        }
        System.out.println("END");
        
//        for(Seagual gul1: mas){
      //      gul1.cry();
    }
    }

