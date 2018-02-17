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
public class Pishevod {
    private Boolean isHealth = true;
    private Pochki pochki;
    


    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    public void transfer(String food) {
        System.out.println("пяща в пищеводе");
        pochki.transfer(food);
    }

    public Pishevod(Pochki pochki) {
        this.pochki = pochki;
    }

    public void setPochki(Pochki pochki) {
        this.pochki = pochki;
    }

   
    
    
    
}
