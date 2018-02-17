/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Cube
 */
class Adress {
    
    private String city;
    private String street;
    private int zip;

    public Adress(String city, String street, int zip) {
        this.city = city;
        this.street = street;
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Adress{" + "city=" + city + ", street=" + street + ", zip=" + zip + '}';
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getZip() {
        return zip;
    }
    
    
    
}
