/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

/**
 *
 * @author Cube
 */
public class Printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computer computer = new Computer();
        HDprinter hDprinter = new HDprinter();
        computer.setCurrentPrint(hDprinter);
        computer.printSomthing("Kokoko");
        Print3D print3D = new Print3D();
        computer.setCurrentPrint(print3D);
        computer.printSomthing("Kokoko2");
    }
    
}
