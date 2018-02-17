/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Comparator.PersonByNameComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Cube
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Phone phone = new Phone(10,"ffff");
        Phone phone2 = new Phone(155,"ffews");

   

        Radio radio = new Radio(1,"rrrg");
        TV tv = new TV(44,"ajujuj");

        Radio radio2 = new Radio(4,"vrgr");
        TV tv2 = new TV(4,"rrfrfrf");
        Phone phone3 = new Phone(3,"rgrgrgr");
        Radio radio3 = new Radio(22,"brfrfr");
        TV tv3 = new TV(41,"rgrgr");

        Collections.addAll(products, phone, tv, radio);
        Collections.addAll(products, phone3, tv3, radio3);
        Collections.addAll(products, phone2, tv2, radio2);
        Collections.sort(products, new ProductByNameComparator());
        for (Object a : products) {
          System.out.println(a);
        }
        System.out.println("");
       Collections.sort(products, new ProductByPriceComparator());
       for (Object a : products) {
            System.out.println(a);
        }
    }
}
