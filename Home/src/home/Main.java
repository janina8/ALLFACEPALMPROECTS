/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

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
        int [] homeInfo = {4, 8, 3, 6, 8, 6, 7};
        int floors = homeInfo.length;
        Home home = new Home(homeInfo);
       
        Pult pult = new Pult();
        pult.setHome(home);
        pult.chooseApartament(5);
        
        int age;
        long time;
        long dateOfB;
        long ageM;
       Date date = new Date();
       time = date.getTime();
       Date dateOfBirth = new Date(1990-1900, 1, 12);
       dateOfB = dateOfBirth.getTime();
       ageM = time - dateOfB;
       ageM = ageM/(365L*24L*60L*60L*1000L);
       age = (int)ageM;
        System.out.println(age);
       // home.print();
    }

}
