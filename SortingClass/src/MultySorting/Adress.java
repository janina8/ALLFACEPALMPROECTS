/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultySorting;


/**
 *
 * @author Cube
 */
public class Adress {
    
    private String street;
    private int homeNubmer;

    public String getStreet() {
        return street;
    }

    public int getHomeNubmer() {
        return homeNubmer;
    }

    public Adress(String street, int homeNubmer) {
        this.street = street;
        this.homeNubmer = homeNubmer;
    }

    @Override
    public String toString() {
        return "Adress{" + "street=" + street + ", homeNubmer=" + homeNubmer + '}';
    }
    
    
    
}
