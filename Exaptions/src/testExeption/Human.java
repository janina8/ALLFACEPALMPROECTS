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
public class Human {

    private Head head;

    private Pishevod pishevod;
    private Pochki pochki;
    private Stomack stomack;
    private TonkajaKishka tonkajaKishka;
    private TolstajaKishka tolstajaKishka;
    private Boolean isHealth = true;

    public Human() {
        this.pishevod = new Pishevod(pochki);
        this.head = new Head("white", pishevod);
        this.pochki = new Pochki(stomack);

        this.stomack = new Stomack(tonkajaKishka);
        this.tonkajaKishka = new TonkajaKishka(tolstajaKishka);
        this.tolstajaKishka = new TolstajaKishka();

        pishevod.setPochki(pochki);
        pochki.setStomack(stomack);
        stomack.setTonkajaKishka(tonkajaKishka);
        tonkajaKishka.setTolstajaKishka(tolstajaKishka);
    }

    public void klastjEduVgolovu(String food) {
        System.out.println("Человеческое существо кладет пищу в рот");
        head.eat(food);

    }

    public Head getHead() {
        return head;
    }

    public Pishevod getPishevod() {
        return pishevod;
    }

    public Pochki getPochki() {
        return pochki;
    }

    public Stomack getStomack() {
        return stomack;
    }

    public TonkajaKishka getTonkajaKishka() {
        return tonkajaKishka;
    }

    public TolstajaKishka getTolstajaKishka() {
        return tolstajaKishka;
    }

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setPishevod(Pishevod pishevod) {
        this.pishevod = pishevod;
    }

    public void setPochki(Pochki pochki) {
        this.pochki = pochki;
    }

    public void setStomack(Stomack stomack) {
        this.stomack = stomack;
    }

    public void setTonkajaKishka(TonkajaKishka tonkajaKishka) {
        this.tonkajaKishka = tonkajaKishka;
    }

    public void setTolstajaKishka(TolstajaKishka tolstajaKishka) {
        this.tolstajaKishka = tolstajaKishka;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

}
