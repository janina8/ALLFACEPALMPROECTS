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
public class TonkajaKishka {
    private Boolean isHealth = true;
    
    private TolstajaKishka tolstajaKishka;

    public TonkajaKishka(TolstajaKishka tolstajaKishka) {
        this.tolstajaKishka = tolstajaKishka;
    }

    public void setTolstajaKishka(TolstajaKishka tolstajaKishka) {
        this.tolstajaKishka = tolstajaKishka;
    }
    
 
    

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    void transfer(String food) {
          System.out.println("пища в тонкой кишке");
        tolstajaKishka.transfer(food);
    }
    
    
    
}
