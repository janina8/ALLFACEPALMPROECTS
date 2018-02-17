/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPhone;

import DataPhone.Phone;
import dataIo.Frizer;
import dataIo.Product;
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
import java.util.ArrayList;
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
        Phone phone = new Phone("Nokia", 3000);
        Sim sim = new Sim(122222221, 30, "baltcom");
        phone.setSim(sim);
        Phone phone2 = new Phone("Sony", 3000);
        Sim sim2 = new Sim(122222221, 30, "baltcom");
        phone.setSim(sim);
        Phone phone3 = new Phone("Aple", 3000);
        Sim sim3 = new Sim(122222221, 30, "baltcom");
        phone.setSim(sim);
        phone2.setSim(sim2);
        phone3.setSim(sim3);

        List<Phone> phones = Arrays.asList(phone, phone2, phone2);
        for (Phone a : phones) {
            saveInFile(a);

        }

        Phone phone4 = new Phone("Koko", 434);
        phone4.setSim(sim);
        saveInFile(phone4);
        //products2.add(frizer3);
        ArrayList<Product> products3 = new ArrayList<Product>();
        loadFile(products3);
        for (Phone p : phones) {
            System.out.println(p);
        }
    }

    private static void saveInFile(Phone a) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("kuku2.kura", true)))) {

            String brand = a.getBrand();
            Sim s = a.getSim();
            int simNumber = s.getNumber();
            int simSum = s.getSum();
            String simProvider = s.getProvider();
            Accumulator ac = a.getAccumulator();
            int maxCap = ac.getMaxCapacity();
            int minCap = ac.getMinCapacity();
            int currCap = ac.getCurrentCapacity();

            dataOutputStream.writeUTF(brand);
            dataOutputStream.writeInt(simNumber);
            dataOutputStream.writeInt(simSum);
            dataOutputStream.writeUTF(simProvider);
            dataOutputStream.writeInt(maxCap);
            dataOutputStream.writeInt(minCap);
            dataOutputStream.writeInt(currCap);

        } catch (FileNotFoundException b) {
        } catch (IOException c) {

        }

    }

    private static void loadFile(ArrayList phones) {

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("kuku2.kura")))) {
            try {
                while (true) {
                    String brand = dataInputStream.readUTF(); // в такой же последовательности считываем
                    int simNumber = dataInputStream.readInt();
                    int simSum = dataInputStream.readInt();
                    String simProvider = dataInputStream.readUTF();
                    int maxCap = dataInputStream.readInt();
                    int minCap = dataInputStream.readInt();
                    int currCap = dataInputStream.readInt();

                    Sim sim4 = new Sim(simNumber, simSum, simProvider);
                    Accumulator ac2 = new Accumulator(maxCap);

                    Phone phone1 = new Phone(brand, maxCap);

                    phone1.setSim(sim4);
                    phone1.setAccumulator(ac2);

                    System.out.println(phone1);
                }
            } catch (EOFException e) {

            }

        } catch (FileNotFoundException b) {
        } catch (IOException c) {

        }
    }

}


/*try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("phones.obj")))) {
            for (Phone a : phones) {
                Sim s = a.getSim();
                Accumulator ac = a.getAccumulator();
                Display d = a.getDisplay();
                a.setAccumulator(ac);
                a.setSim(sim);
                objectOutputStream.writeObject(a);

            }

        } catch (FileNotFoundException b) {
        } catch (IOException c) {
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("phones.obj")))) {
          try{  
            while(true){
                
  
                Phone c = (Phone) objectInputStream.readObject();
                
                
           
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
}



 */
