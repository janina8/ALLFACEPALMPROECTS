/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

/**
 *
 * @author Cube
 */
public class Cabinet {
    
    private String adress;
    private int size;

    public Cabinet(String adress, int size) {
        this.adress = adress;
        this.size = size;
    }
    
    
    public String getAdress(){
        return adress;
    }
}
