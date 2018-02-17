
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class FirstClass {
    
    public static void main(String[] args) {
        long accountNumber = 124578L;
        boolean isBlocked = true;
        Date date = new Date();
        MyClass mc = new MyClass();
        System.out.println(mc);
        double x = 5.5;
         double y= 6.029393;
        double c = 8;
        double result;
        double e = 5;
        double z;
        char f = 'a';
        result = Math.pow((Math.pow(x, 3)/5*(Math.pow(y, 1.0/3.0))+5*c ), 1.0/3);
        
        z = Math.pow(e, 0.2) * Math.pow(x,3)*(Math.pow(c-1, 0.5))- 13;
        
        if (z > 3.2){
            System.out.println(z>3.2);
        }
        else { System.out.println(3.2);}
        
        System.out.println(result);
    }
    
}
