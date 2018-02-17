package pack2;

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
        // TODO code application logic here
        
        Dantist dantist = new Dantist(Category.HIGH_LEVEL,"Vasja");
        Dantist dantist2 = new Dantist("Petja");
        
        dantist.drillTeeth();
        dantist2.downArmchair();
        dantist2.breakDevices(MedicalDevice.DEVICE_N);
        dantist.talkAboutCategory();
        System.out.println(dantist.cabAdress());
        MedicalDevice [] devices = MedicalDevice.values();
        
        for (int i = 0; i < devices.length; i++){
            devices[i].start();
        }
        
    }
    
}
