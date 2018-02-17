/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testExeption;

/**
 *
 * @author Cube
 */
public class TolstajaKishka {
    private Boolean isHealth = false;

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    void transfer(String food) {
        System.out.println("Пища пришла в тостую кишку");
        if(isHealth==false){
            throw new ExceptionInInitializerError();
            
        }
           System.out.println("Пища вышла");
    }

 
    
    
}
