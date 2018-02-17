/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtest;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Cube
 */
 
public class SwTest implements Runnable{
    @Override
    public void run() {
        JFrame jf = new JFrame();
        JDesktopPane jdp = new JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D)g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.blue);
                g2d.fillOval(10, 10, getWidth() - 20, getHeight() * 2 - 20);
                g2d.setColor(Color.red);
                g2d.fillOval(20, 20, getWidth() - 40, getHeight() - 40);
                g2d.setColor(Color.yellow);
                g2d.fillOval(30, 30, getWidth() - 60, getHeight() - 60);
                g2d.setColor(Color.black);
                g2d.fillOval(getWidth()/4 - getWidth()/16, getHeight()/2-getHeight()/8, getWidth()/8, getHeight()/8);
                g2d.fillOval(getWidth()*3/4 - getWidth()/16, getHeight()/2-getHeight()/8, getWidth()/8, getHeight()/8);
                g2d.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2d.drawArc(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2, 225, 90);
            }
        };
 
        JInternalFrame jfi = new JInternalFrame("Title");
        jfi.setVisible(true);
        jfi.setSize(300, 200);
        jdp.add(jfi);
        jf.setContentPane(jdp);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(800, 600);
        jf.setVisible(true);
    }
 
    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        EventQueue.invokeAndWait(new SwTest());
 
    }
}
    

