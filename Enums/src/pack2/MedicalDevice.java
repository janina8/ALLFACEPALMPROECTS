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
public enum MedicalDevice {ARMCHAIR(), BOR_MACHINE, DEVICE_N("Bosh", 10);
    private String name;
    private int size;
    private boolean isWork;

    private MedicalDevice(String name, int size) {
        this.name = name;
        this.size = size;
        this.isWork = true;
    }

    private MedicalDevice() {
        this.name = "Simens";
        this.size = 3;
        this.isWork = true;
    }
    
    public void breakDevice() {
    this.isWork = false;
     System.out.println("Device is break: " +name);
    }
    public void start() {
        System.out.println("Device is start: " +name);
    }   
    
}
