
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class JInternalFrame1 extends JInternalFrame{
   
    
   // JInternalFrame1 jfi = new JInternalFrame1("Title");
   
      
      public static void fra() {
          
        JInternalFrame jfi = new JInternalFrame();
        jfi.setVisible(true);
        jfi.setSize(300, 200);

        jfi.setBackground(Color.blue);
        jfi.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

   

    public JInternalFrame1(String title) {
        super(title);
    }

  
}


