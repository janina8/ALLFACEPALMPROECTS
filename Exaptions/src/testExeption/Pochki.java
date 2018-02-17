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
public class Pochki {
    private Boolean isHealth = true;
    
    private Stomack stomack;
    private Pishevod pishevod;
    
   

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    void transfer(String food) {
        System.out.println("пища в почках");
        stomack.transfer(food);
    }

    public Pochki(Stomack stomack) {
        this.stomack = stomack;
        
    }

    public void setStomack(Stomack stomack) {
        this.stomack = stomack;
    }


    
    
    
}
