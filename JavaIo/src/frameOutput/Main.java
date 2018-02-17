/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameOutput;

import Object.Car;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

        NewJFrame newJFrame = new NewJFrame();
        NewJFrame newJFrame1 = new NewJFrame();
        newJFrame.setTitle("Привет, я первое окно.");
        newJFrame1.setTitle("Привет, а я второе окно.");
        newJFrame.setSize(330, 560);

        newJFrame.setVisible(true);
        newJFrame1.setVisible(true);

        List<NewJFrame> newJFrames = Arrays.asList(newJFrame, newJFrame1);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("newJFrame.koko")))) {
            for (NewJFrame a : newJFrames) {
                objectOutputStream.writeObject(a);

            }

        } catch (FileNotFoundException b) {
        } catch (IOException c) {
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("newJFrame.koko")))) {
            try {
                while (true) {
                    NewJFrame c = (NewJFrame) objectInputStream.readObject();
                    System.out.println(c);
                }
            } catch (EOFException e) {

            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
