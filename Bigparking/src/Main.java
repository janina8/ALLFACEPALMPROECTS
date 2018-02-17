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
        int[] con = {3, 8, 7, 9, 5};
        Bigparking bigparking = new Bigparking(con);
      
       
      //  Bigparking bigparking4 = bigparking.clone2();
        Car car = new Car("BMV", 11);
        Car car2 = new Car("BMV", 2);
        Car car4 = new Car("Тележка", 2);
        Car car3 = bigparking.takeCar(11);
     
      
        bigparking.addCar(0, 1, car2);
        bigparking.addCar(0, 2, car4);

     
        Bigparking bigparking2 = bigparking.clone();


      //  bigparking.printParking();
        bigparking2.printParking();
bigparking.printParking();
        //Bigparking bigparking3 = new Bigparking(bigparking);
//            bigparking3.printParking();
    }

}
