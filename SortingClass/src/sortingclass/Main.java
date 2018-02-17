/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingclass;

import java.util.ArrayList;
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
        // TODO code application logic here

        //     ArrayList<Dog> listDog = new ArrayList<>();
        Dog dog = new Dog("Шарик", new Date(2040 - 1900, 05, 15), 5, 01);
        Dog dog2 = new Dog("Арик", new Date(2040 - 1940, 15, 15), 5, 02);
        Dog dog3 = new Dog("Ярик", new Date(2030 - 1900, 01, 15), 5, 03);
        Dolphin dolphin = new Dolphin("Петя", new Date(2040 - 1900, 05, 15), 5, 9);
        Dolphin dolphin2 = new Dolphin("Петя", new Date(2040 - 1900, 05, 15), 5, 9);
        Dolphin dolphin3 = new Dolphin("Петя", new Date(2040 - 1900, 05, 15), 5, 9);
        Dolphin dolphin4 = new Dolphin("Петя", new Date(2040 - 1900, 05, 15), 5, 9);

        DogHome dogHome = new DogHome(new Date(2040 - 1900, 05, 15), 20, 1);
        DogHome dogHome2 = new DogHome(new Date(2040 - 1900, 05, 15), 20, 10);
        DogHome dogHome3 = new DogHome(new Date(2040 - 1900, 05, 15), 20, 19);

        ArrayList allClasses = new ArrayList();

        Collections.addAll(allClasses, dog, dog2, dog3);
        Collections.addAll(allClasses, dolphin, dolphin2, dolphin3, dolphin4);
        Collections.addAll(allClasses, dogHome, dogHome2, dogHome3);

        Collections.sort(allClasses);
        //  Collections.reverse(listPerson);
        for (Object a : allClasses) {
            System.err.println(a);
        }

        // ArrayList<Dolphin> listDolphin = new ArrayList<>();
        //    Collections.addAll(listDolphin, dolphin, dolphin2, dolphin3, dolphin4);
        //     Collections.sort(listDolphin);
        //     for (Dolphin b : listDolphin) {
        //         System.err.println(b);
        //   ArrayList<DogHome> listDogHome = new ArrayList<>(); 
        //       Collections.addAll(listDogHome, dogHome, dogHome2, dogHome3);
        //       Collections.sort(listDogHome);
        //       for (DogHome z : listDogHome) {
        //            System.err.println(z);
    }
}
