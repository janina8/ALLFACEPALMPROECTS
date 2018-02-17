/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zip;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import text.Product;

/**
 *
 * @author Cube
 */
public class Main3 {

    public static void main(String[] args) throws IOException {
        ZipOutputStream zipOutputStream = null;
        PrintWriter printWriter = null;
        DataOutputStream dataOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        FileWriter fileWriter = null;
        try {
            Cat cat = new Cat("Vasya");
            Cat cat2 = new Cat("Petya");
            Cat cat3 = new Cat("Kura");
            Vegetable vegetable = new Vegetable("tomato");
            Vegetable vegetable2 = new Vegetable("ogurec");
            Doctor doctor = new Doctor("Nikolaj", 50);
            Stewardess stewardess = new Stewardess("Anna", 33);
            Student student = new Student("Kolja", 18, "Garvard");
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(student);
            persons.add(doctor);
            persons.add(stewardess);
            ArrayList<Vegetable> vegetables = new ArrayList<>();
            vegetables.add(vegetable);
            vegetables.add(vegetable2);
            ArrayList<Cat> cats = new ArrayList<>();
            cats.add(cat);
            cats.add(cat2);
            cats.add(cat3);
            ArrayList objects = new ArrayList();
            objects.addAll(persons);
            objects.addAll(vegetables);
            objects.addAll(cats);

            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("file.jar")));
            ZipEntry zipEntry1 = new ZipEntry("allObjects.obj");
            zipOutputStream.putNextEntry(zipEntry1);

            objectOutputStream = new ObjectOutputStream(zipOutputStream);

            for (Object a : objects) {
                objectOutputStream.writeObject(a);
            }

            zipOutputStream.closeEntry();

            ZipEntry zipEntry2 = new ZipEntry("cats55.txt");
            zipOutputStream.putNextEntry(zipEntry2);
            dataOutputStream = new DataOutputStream(zipOutputStream);

            for (Cat a : cats) {
                dataOutputStream.writeChars(a.toString());
            }
            zipOutputStream.closeEntry();

            ZipEntry zipEntry3 = new ZipEntry("vagetables.dat");
            zipOutputStream.putNextEntry(zipEntry3);
            dataOutputStream = new DataOutputStream(zipOutputStream);

            for (Vegetable a : vegetables) {
                dataOutputStream.writeUTF(a.getType());
            }
            zipOutputStream.closeEntry();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                zipOutputStream.close();
//                printWriter.close();
                // fileWriter.close();

                objectOutputStream.close();
//                dataOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}

/*    ZipEntry zipEntry2 = new ZipEntry("cats.txt");
            zipOutputStream.putNextEntry(zipEntry2);
            printWriter = new PrintWriter(new OutputStreamWriter(zipOutputStream));
            for(Cat a: cats){
                printWriter.write(a.toString()+"\n");
            }
            zipOutputStream.closeEntry(); */// 73/79 - main str

 /*   ZipEntry zipEntry2 = new ZipEntry("cats.txt");
            zipOutputStream.putNextEntry(zipEntry2);
           fileWriter = new FileWriter("cats.txt");
            for(Cat a: cats){
                fileWriter.write(a.toString()+"\n");
            }
            zipOutputStream.closeEntry();


 ZipEntry zipEntry2 = new ZipEntry("cats2.txt");
           
             printWriter = new PrintWriter(new OutputStreamWriter(zipOutputStream));
            zipOutputStream.putNextEntry(zipEntry2);
             
            fileWriter = new FileWriter("cats.txt"); //(new OutputStreamWriter(zipOutputStream));
           
           OutputStreamWriter outputStreamWriter = new OutputStreamWriter(zipOutputStream);
           
            for(Cat a: cats){
                  printWriter.write(a.toString());
                fileWriter.write(a.toString()+"\n");
                
             
              
            } */
