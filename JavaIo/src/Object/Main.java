/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import DataPhone.Phone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cube
 */
public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(20, 21);
        GearBox gearBox = new GearBox(500);
        Car car = new Car("BMV", "black", engine, gearBox);

        Engine engine2 = new Engine(26, 21);
        GearBox gearBox2 = new GearBox(200);
        Car car2 = new Car("AUDI", "black", engine2, gearBox2);

        Engine engine3 = new Engine(30, 61);
        GearBox gearBox3 = new GearBox(800);
        Car car3 = new Car("KAMAZ", "white", engine3, gearBox3);

        List<Car> cars = Arrays.asList(car, car2, car3);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("cars.obj")))) {
            for (Car a : cars) {
                objectOutputStream.writeObject(a);

            }

        } catch (FileNotFoundException b) {
        } catch (IOException c) {
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("cars.obj")))) {
          try{  
            while(true){
                Car c = (Car) objectInputStream.readObject();
                System.out.println(c);
            }
          }
          catch(EOFException e){
              
          }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
    
    //Дз: телефоны сохранять в объектые файлы и считывать назад
}
