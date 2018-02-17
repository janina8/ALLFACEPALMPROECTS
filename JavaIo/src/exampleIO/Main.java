/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleIO;

/**
 *
 * @author Cube
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        //InputStream in = null;
        //OutputStream out = null;
        //BufferedInputStream bin = null;
        //BufferedOutputStream bout = null;
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("Song.mp3"));
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("CopySong.mp3"))) {
            //in = new FileInputStream("Song.mp3");
//            bin = new BufferedInputStream(new FileInputStream("Song.mp3") );
//            out = new FileOutputStream("CopySong.mp3");
//            bout = new BufferedOutputStream(out);
            int value;
            while ((value = bin.read()) != -1) {
                bout.write(value);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex) {
            System.out.println("io problems");
            
            
        } 
        
////        finally {
////            try {
////
////                if (bin != null) {
////                    bin.close();
////                }
////                if (bout != null) {
////                    bout.close();
////                }
////
////                if (out != null) {
////                    out.close();
////                }
////
////            } catch (IOException ex) {
////                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
////            }
////
////        }
    }
}
