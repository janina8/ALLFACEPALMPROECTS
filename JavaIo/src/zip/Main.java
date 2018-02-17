/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zip;

import Object.Car;
import static java.awt.SystemColor.text;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Cube
 */
public class Main {

    public static void main(String[] args) {
        ZipOutputStream zipOutputStream = null;
        PrintWriter printWriter = null;
        DataOutputStream dataOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        FileWriter fileWriter = null;
        PrintStream printStream = null;
        ZipInputStream zipInputStream = null;
        ObjectInputStream objectInputStream = null;
        BufferedReader bufferedReader = null;
        DataInputStream dataInputStream = null;
        
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

            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("file.zip")));
            ZipEntry zipEntry1 = new ZipEntry("allObjects.obj");
            zipOutputStream.putNextEntry(zipEntry1);

            objectOutputStream = new ObjectOutputStream(zipOutputStream);

            for (Object a : objects) {
                objectOutputStream.writeObject(a);
            }

            zipOutputStream.closeEntry();

            ZipEntry zipEntry2 = new ZipEntry("cats.txt");

            zipOutputStream.putNextEntry(zipEntry2);

            printStream = new PrintStream(zipOutputStream);
            for (Cat a : cats) {

                printStream.println(a.toString() + "\n");
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

                objectOutputStream.close();
                dataOutputStream.close();
                printStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            zipInputStream = new ZipInputStream(new FileInputStream("file.zip"));
            zipInputStream.getNextEntry();
            objectInputStream = new ObjectInputStream(zipInputStream);
           try{  
            while(true){
                 Object o = objectInputStream.readObject();
                 System.out.println(o);
            }
           }catch(EOFException s){
               
           }
            zipInputStream.closeEntry();
            
            zipInputStream.getNextEntry();
            bufferedReader = new BufferedReader(new InputStreamReader(zipInputStream));
            
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            zipInputStream.closeEntry();
            
            zipInputStream.getNextEntry();
            
            
            
            dataInputStream = new DataInputStream(zipInputStream);
            
            try {
                while (true){
                    String name = dataInputStream.readUTF();
                    System.out.println(name);
                }
            }catch(EOFException s){
               
           }
            zipInputStream.closeEntry();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally {
            try {
                zipInputStream.close();

                objectInputStream.close();
                bufferedReader.close();
              
                dataInputStream.close();
              
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
