/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataIo;

import Data.Person;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Cube
 */
public class Main {

    public static void main(String[] args) {

        Frizer frizer = new Frizer(666, "frizer", "LG", 54544, "kokokoko", true);
        Laptop laptop = new Laptop(444444, "laptop", "dell", 555.5, " KO ko ko ko", true);
        TV tv = new TV(2323433, "TV", "samsung", 4343, "kukareku", false);
        WashingMashine washingMashine = new WashingMashine(4343, "washing mashine", "apple", 2121212121, "Ko", true);

        List<Product> products = Arrays.asList(frizer, laptop, tv, washingMashine);

        for (Product a : products) {
            saveInFile(a);

        }
        //List<Product> products2 = new ArrayList<Product>();

        Frizer frizer3 = new Frizer(46464, "frizer", "apple", 5464.66, "koko", true);
        saveInFile(frizer3);
        //products2.add(frizer3);
        ArrayList<Product> products3 = new ArrayList<Product>();
        loadFile(products3);
        for (Product p : products3) {
            System.out.println(p);
        }
    }

    private static void saveInFile(Product a) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("products.dat", true)))) {

            int number = a.getNumber();
            String type = a.getType();
            String brand = a.getBrand();
            double price = a.getPrice();
            String description = a.getDescription();
            boolean isInStock = a.isIsInStock();

            dataOutputStream.writeInt(number);
            dataOutputStream.writeUTF(type);
            dataOutputStream.writeUTF(brand);
            dataOutputStream.writeDouble(price);
            dataOutputStream.writeUTF(description);
            dataOutputStream.writeBoolean(isInStock);

        } catch (FileNotFoundException b) {
        } catch (IOException c) {

        }

    }

    private static void loadFile(ArrayList products2) {
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("products.dat")))) {
            try {
                while (true) {

                    int number = dataInputStream.readInt();
                    String type = dataInputStream.readUTF();
                    String brand = dataInputStream.readUTF();
                    double price = dataInputStream.readDouble();
                    String description = dataInputStream.readUTF();
                    boolean isInStock = dataInputStream.readBoolean();

                    switch (type) {
                        case "frizer":
                            Frizer frizer2 = new Frizer(number, type, brand, price, description, isInStock);
                            products2.add(frizer2);
                            break;

                        case "laptop":
                            Laptop laptop2 = new Laptop(number, type, brand, price, description, isInStock);
                            products2.add(laptop2);
                            break;

                        case "TV":
                            TV tv2 = new TV(number, type, brand, price, description, isInStock);
                            products2.add(tv2);
                            break;
                        case "washing mashine":
                            WashingMashine washingMashine2 = new WashingMashine(number, type, brand, price, description, isInStock);
                            products2.add(washingMashine2);
                            break;
                    }
                }

            } catch (EOFException e) {

            }

        } catch (FileNotFoundException b) {
        } catch (IOException c) {

        }

    }
}
