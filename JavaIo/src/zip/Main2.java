/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zip;

import Object.Car;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
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
public class Main2 {
    
   
   //     ZipOutputStream zipOutputStream = null;
    //     PrintWriter printWriter = null;
        
         
     public static void main(String[] args) {
        
        String filename = "cats.txt";
        ZipEntry zipEntry2 = new ZipEntry("cats.txt");
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("cats.txt"));
                FileInputStream fis= new FileInputStream(filename);)
        {
            ZipEntry entry1=new ZipEntry(filename);
            zout.putNextEntry(entry1);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}
 

        /*    
            zipOutputStream.putNextEntry(zipEntry2);
            
            
            
            printWriter = new PrintWriter(new OutputStreamWriter(zipOutputStream));
            for(Cat a: cats){
                printWriter.write(a.toString()+"\n");
            }
            zipOutputStream.closeEntry();





















         /*
         
        try {
            Cat cat = new Cat("Vasya");
            Cat cat2 = new Cat("Petya");
            Cat cat3 = new Cat("Kura");
            
            ArrayList<Cat> cats = new ArrayList();
         
            cats.add(cat);
            cats.add(cat2);
            cats.add(cat3);
           
       //    ДЗ: посмотреть запись в zip фаил текстого файла. 
            
       /*     zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("cats.zip")));
            
            
            ZipEntry zipEntry2 = new ZipEntry("cats4.txt");
            zipOutputStream.putNextEntry(zipEntry2);
            printWriter = new PrintWriter(new OutputStreamWriter(zipOutputStream));
            for(Cat a: cats){
                String b = a.toString();
                printWriter.write(b+"\n");
            }
            zipOutputStream.closeEntry();
            
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                zipOutputStream.close();
                printWriter.close();
              
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    */

    

