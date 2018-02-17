/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer1;

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Printer printer = new Printer(true);
        Computer1 computer1 = new Computer1(printer);
        Computer1 computer2 = new Computer1(printer);
        
        
        
        System.out.println(computer1.equals(computer2));
        
        computer1.on();
        computer1.writeSomething();
        computer1.printOnprinter();

    }

}
