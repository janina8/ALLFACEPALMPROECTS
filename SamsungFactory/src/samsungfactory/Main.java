/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samsungfactory;

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
        
        SamsungFactory samsungFactory = new SamsungFactory();
         Phone phone = new Phone("Samsung");
         Phone phone2 = new Phone("Samsung apls");
         Phone phone3 = new Phone("Samsung apls2");
         
         samsungFactory.addPhone(phone);
         samsungFactory.addPhone(phone2);
         samsungFactory.addPhone(phone3);
         
         samsungFactory.showProducts();
    }
    
}
