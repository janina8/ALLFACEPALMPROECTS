/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Cube
 */
public class Main_1 extends javax.swing.JFrame {
    private ArrayList<Person> persons = new ArrayList<>();
    
   
    public Main_1() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(30, 30, 400, 400);
        JTextArea jTextArea1 = new JTextArea();
        JButton byName = new JButton("ByName");
        this.getContentPane().add(jTextArea1);
        Adress adress = new Adress("Pushkina", 1);
        Adress adress2 = new Adress("Pushkina", 5);
        Adress adress3 = new Adress("Pushkina", 2);
        Adress adress4 = new Adress("Pushkina", 5);
        Adress adress5 = new Adress("Pushkina", 2);
        Person person = new Person("Вася", "Петрочвич", 1212.1111, new Date(2041 - 1900, 05, 5), 53434, adress, true);
        Person person2 = new Person("Кура", "Курьевна", 1212.1111, new Date(2060 - 1900, 05, 05), 43434, adress2, true);
        Person person3 = new Person("Кура", "Курьевна", 5212.1111, new Date(2040 - 1900, 05, 11), 43434, adress3, true);
        Person person4 = new Person("Василиса", "Петрович", 1212.1111, new Date(2060 - 1900, 05, 05), 43434, adress5, true);
        Person person5 = new Person("Оля", "Кококо", 1212.1111, new Date(2040 - 1900, 05, 11), 43434, adress4, true);
        Person person6 = new Person("Оля", "Кококо", 1212.1111, new Date(2040 - 1900, 05, 11), 4004, adress4, false);

        Collections.addAll(persons, person, person2, person3, person4, person5, person6);
        Collections.sort(persons);
        
      

        //    for(Person a:persons){
        //        System.out.println(a);
        //   }
        for (Person a : persons) {
            System.out.println(a);
        }
        //Collections.sort(persons, new PersonByNameAndSalaryComparator());
        for (Person a : persons) {
            System.out.println(a);
            jTextArea1.append(a.toString()+"\n");
        }
    }
        

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //      java.awt.EventQueue.invokeLater(new Runnable() {
        //         public void run() {
        //
        //     NewJFrame newJFrame =   new NewJFrame();
        //            newJFrame.setVisible(true);
        //
        //       }
        //   });
        
        
        
        
        Main_1 newJFrame =   new Main_1();
        newJFrame.setVisible(true);
    }
}