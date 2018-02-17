/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        method2();
      
    }
    public static void method2() {
        try {

            Service service = new Service();
            service.service();
            int a = 5 / 0;

            System.out.println(a);
        } 
        catch (ArithmeticException e) {
            System.out.println("Поймали деление на 0 !!");
        }
    }
}
