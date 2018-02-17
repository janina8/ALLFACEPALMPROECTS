/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.WindowConstants;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFrame1 extends JFrame { //Наследуя от JFrame мы получаем всю функциональность окна
  
    private JInternalFrame1 jInternalFrame1;
    
     public void run() {
        JFrame jf = new JFrame();
        JDesktopPane jdp = new JDesktopPane();
            
      
        Color c1 = new Color(100, 200, 217);
        Color c2 = new Color(190, 100, 137);
        jdp.setBackground(c1);

        
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu editMenu = new JMenu("Menu");
        menuBar.add(editMenu);
        
         JMenuItem pasteItem = new JMenuItem("Add Invoice");
         JMenuItem pasteItem2 = new JMenuItem("Show Invoice");
         
         
         editMenu.add(pasteItem);
         editMenu.add(pasteItem2);
         editMenu.addSeparator();
         
       
        
         ActionListener listener = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
                 JInternalFrame jfi = new JInternalFrame("Add Invoice");
                
                jdp.add(jfi);
             }
         };  

         ActionListener listener2 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                JInternalFrame jfi2 = new JInternalFrame("Show Invoice");
                
                jdp.add(jfi2);
             }
         };
        
        pasteItem.addActionListener(listener);
        pasteItem2.addActionListener(listener2);
        
        
         
        
     
       
        jf.setJMenuBar(menuBar);
        
     
        //главное окно
        jf.setContentPane(jdp);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(900, 600);
        jf.setVisible(true); 
        
        //второе внутренее окно
      /*  JInternalFrame jfi2 = new JInternalFrame("Show Invoice");
        jfi2.setVisible(true);
        jfi2.setSize(300, 200);
        jfi2.setBackground(c2);
        jdp.add(jfi2);
        jfi2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); */
        
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

   

 
  
     
}
                
              
        



    

