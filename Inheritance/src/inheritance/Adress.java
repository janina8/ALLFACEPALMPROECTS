/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Cube
 */
public class Adress {
    
    private String city;
    
    private String street;
    
    private int homeNumber;

    public Adress(String city, String street, int homeNumber) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }
    
    
    
    
}
