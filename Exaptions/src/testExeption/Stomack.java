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
public class Stomack {
    
    private Boolean isHealth = true;
    
    private TonkajaKishka tonkajaKishka;
    

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    void transfer(String food) {
        System.out.println("пища в желудке");
       tonkajaKishka.transfer(food);
    }

    public Stomack(TonkajaKishka tonkajaKishka) {
        this.tonkajaKishka = tonkajaKishka;
    }

    public void setTonkajaKishka(TonkajaKishka tonkajaKishka) {
        this.tonkajaKishka = tonkajaKishka;
    }

   
    
}
