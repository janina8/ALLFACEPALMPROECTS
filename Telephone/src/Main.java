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
    
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Nokia", 3000);
        
       
        telephone.call("12345");
        Sim sim = new Sim(122222221, 30, "baltcom");
        telephone.setSim(sim);
        telephone.call("12345");
    }
}
