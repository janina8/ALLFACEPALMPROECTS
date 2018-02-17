
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Bigparking implements Prototype {
    
   // private int z, w;
    private Car[][] cars;
    

    private int [] con ; 
    
  
    public Bigparking(int [] cont) {
        this.con = cont;
       cars = new Car[cont.length][];
       for(int i = 0; i< cont.length; i++){
           Car [] floor = new Car[cont[i]];
           cars[i] = floor;
       }
    }
    
    
   
    public boolean carInParking(int flourNumber, int parkingPlace, Car car) { //проверка есть ли уже машина эта в паркинге
/*    for (int a = 0; a < cars.length; a++) {
        for (int i = 0; i < cars[a].length; i++) { */
            if (cars[flourNumber][parkingPlace] == car) {
                return true;
            }
       
          return false;
    }
    
    public Car takeCar(int carNumber) {

        return findCar(carNumber);

    }

              
              
    private Car findCar(int num) {

        for (int flourNumber = 0; flourNumber < cars.length; flourNumber++) {
            for (int parkingPlace = 0; parkingPlace < cars[flourNumber].length; parkingPlace++) {
                if (cars[flourNumber][parkingPlace] != null) {

                    if (cars[flourNumber][parkingPlace].getNumberCar() == num) {
                        return cars[flourNumber][parkingPlace];

                    }

                }
            }
        }
        return null;
    }
    
    public void addCar(int flourNumber, int parkingPlace, Car car) {
        if (!carInParking(flourNumber, parkingPlace, car)) {

            if (cars[flourNumber][parkingPlace] == null) {
                cars[flourNumber][parkingPlace] = car;
                System.out.println("Место занято под номером " + parkingPlace++);

            }
        }

    }
 
    public void printParking() {
        for (int a = 0; a < cars.length; a++) { 
            for (int i = 0; i < cars[a].length; i++) {
                if (cars[a][i] == null) {
                    System.out.print("empty"+"\t");
                } else {
                    System.out.print(cars[a][i].getName()+"\t");
                }
            }
            System.out.println();
        }
}

    

    private Car[][] getCars() {
        return cars;
    }

   

  //  @Override
    public Bigparking clone() {

        Bigparking clone = new Bigparking(this.con);

        for (int i = 0; i < cars.length; i++) {
            for (int a = 0; a < cars[i].length; a++) {
                clone.addCar(i, a, cars[i][a]);
            }
        }

        return clone;

    }

}

    

   /* public Bigparking(Bigparking original) {
        this.cars = cars;
        this.con = con;
        this.w = w;
        this.z = z;
        

    }*/

  
/*
 @Override
    public Bigparking clone() {
        this.con = con;
        Bigparking clone = new Bigparking(con);
        // int[] con = {2, 4, 8};
        Car[][] cars = this.getCars();
        Car[][] carsClon = new Car[cars.length][cars[0].length];

        for (int i = 0; i < cars.length; i++) {

            System.arraycopy(cars[i], 0, carsClon[i], 0, cars[i].length);
        }

        

        return clone;

    }

*/