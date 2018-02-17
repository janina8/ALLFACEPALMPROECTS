/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] temperatures = new double[6];

       

        

        ArrayList<Integer> values = new ArrayList<>();

        ArrayList<String> text = new ArrayList<>();

        text.add("akokoko");
        text.add("atext kakojto");
        text.add("adkokoko2");
        text.add("text kakojto3");
        text.add("kaaaaadd");
        text.add("muuuuuuu");

        Collections.sort(text);

        for (String k : text) {
            System.err.print(k + "\t");
        }

        values.add(4);
        values.add(111);
        values.add(34);
        values.add(88);

        Collections.reverse(values);
        Collections.reverse(values);

        for (int b : values) {
            System.err.print(b + "\t");
        }
        temperatures[0] = 5.1;
        temperatures[1] = 8.5;
        temperatures[2] = 1.1;
        temperatures[3] = 3.5;
        temperatures[4] = 9.1;
        temperatures[5] = 5;

        for (double a : temperatures) {
            System.out.print(a + "\t");
        }
        System.out.println("");

        Arrays.sort(temperatures);
        for (double a : temperatures) {
            System.out.print(a + "\t");
        }
        System.out.println("");

        ArrayList<Date> list = new ArrayList<Date>();
        // list.add(1.01.2001);
        Date date = new Date(1978 - 1900, 01, 31);
        Date date2 = new Date(1928 - 1900, 03, 15);
        Date date3 = new Date(1900 - 1900, 05, 04);
        Date date4 = new Date(2000 - 1900, 03, 05);
        Date date5 = new Date(1005 - 1900, 01, 11);

        Collections.addAll(list, date, date2, date3, date4, date5);

        //    Collections.sort(list);
        Collections.reverse(list);

        for (Date date1 : list) {
            System.out.println(date1);
        }

    }

}
