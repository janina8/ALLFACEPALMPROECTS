/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        ArrayList<Product> list = new ArrayList<>();

        Laptop laptop = new Laptop(4, "laptop", "lg", 545, "koko", true);
        Mango mango = new Mango(10, "food", "kivi", 4, "ololo", true);
        Sim sim = new Sim("Baltcom");
        Phone phone = new Phone(4343, "phone", "apple", 43423, "gr", true, sim);
        Tomato tomato = new Tomato(43, "food", "ikea", 54, "olololo", false);

        List<Product> products = Arrays.asList(laptop, mango, phone, tomato);

        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("products.txt", true)))) {
            for (Product a : products) {
                printWriter.write(a + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("products.txt"))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
//                String[] words = line.split(" ");
//                switch (words[0]) {
//                    case "Laptop":
//                        int v1 = Integer.parseInt(words[1]);
//                        double v2 = Double.parseDouble(words[4]);
//                        boolean v3 = Boolean.parseBoolean(words[6]);
//                        //  new Laptop(v1, words[2], words[3], v2, words[5], true);
//                        list.add(new Laptop(v1, words[2], words[3], v2, words[5], v3));
//                        break;
//                    case "Mango":
//                        int c1 = Integer.parseInt(words[1]);
//                        double c2 = Double.parseDouble(words[4]);
//                        boolean c3 = Boolean.parseBoolean(words[6]);
//                        list.add(new Mango(c1, words[2], words[3], c2, words[5], c3));
//                        break;
//                    case "Phone":
//                        int number = Integer.parseInt(words[3]);
//                        double price = Double.parseDouble(words[6]);
//                        boolean isInstock = Boolean.parseBoolean(words[8]);
//                        String type = words[4];
//                        String brand = words[5];
//                        String description = words[7];
//                        String provider = words[2];
//                        Sim sim1 = new Sim(provider);
//                        list.add(new Phone(number, type, brand, price, description, isInstock, sim1));
//                        break;
//                    case "Tomato":
//                        int q1 = Integer.parseInt(words[1]);
//                        double q2 = Double.parseDouble(words[4]);
//                        boolean q3 = Boolean.parseBoolean(words[6]);
//                        list.add(new Tomato(q1, words[2], words[3], q2, words[5], q3));
//                        break;
//                    default:
//                        break;
//                }
            }
        } catch (IOException ex) {

        }
        for (Product pr : list) {
            System.out.println(pr);
        }
    }

}
