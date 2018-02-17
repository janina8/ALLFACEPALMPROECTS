

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
   
        public static void main(String[] args) {
        
        // Mechanism mechanism = new Mechanism(); //нельзя объект приватного класа сделать вне класса
           
           Watch watch = new Watch();
           Watch.Mechanism mechanism = watch.new Mechanism(); // создание объекта класса из внутреннего класса
           
           watch.showTime();
    }
}

