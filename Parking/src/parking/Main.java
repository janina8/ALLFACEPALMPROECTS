/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

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
        Car car = new Car("bmv");
        Car car2 = new Car("Kokoko");
        Car car3 = new Car("Запорожец");
        Car car4 = new Car("Mitsubishi");
        
        Parking parking = new Parking();
        
        parking.addCar(car);
         parking.addCar(car);
 
          parking.addCar(car4);
          parking.addCar(car4);
          parking.addCar(car3);
          
   //     parking.takeCar(car);
  //      parking.takeCar(car2);
       parking.printParking();
        parking.sizeCars();
        
    }
    
}
