/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;



/**
 *
 * @author Cube
 */
public class Pult {

    private Speaker speaker;

    private Home home;

    public void setHome(Home home) {
        this.home = home;
    }

    public void chooseApartament(int kvartira) {
        try {
            home.callToApartament(kvartira);
        } catch (ReturnExeprion e) {
            System.out.println("home.Pult.chooseApartament()");
        }

    }
}