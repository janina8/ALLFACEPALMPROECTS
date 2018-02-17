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
public class Parking {


    private Car[] cars = new Car[10];

    //   Car[] car = {new Car(12), new Car(10)};
    public void addCar(Car car) {
        if (!carInParking(car)) {
            for (int i = 0; i < cars.length; i++) {

                if (cars[i] == null) {
                    cars[i] = car;
                    System.out.println("Место занято под номером " + (i + 1));
                    break;
                }
            }
        }
    }
    
    public boolean carInParking(Car car) { //проверка есть ли уже машина эта в паркинге

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == car) {
                return true;
            }
                  
        }
          return false;
    }

    public void takeCar(Car car) {

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == car) {
                cars[i] = null;
                System.out.println("Место освободилось для машины под номером "+(i+1));
                break;
            }

        }
    }

    public void sizeCars() {

        System.out.println(cars.length);

    }

    public void printParking() {
        for (Car place : cars) {
            System.out.println(
                    (place == null)
                            ? "empty"
                            : place.getName()
            );
        }
    }

}
