/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function2;

/**
 *
 * @author Cube
 */
public class Phone {
    
    private String brand;
    private double price;
    private int number;

    public Phone(String brand, double price, int number) {
        this.brand = brand;
        this.price = price;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" + "brand=" + brand + ", price=" + price + ", number=" + number + '}';
    }
    
    public void priceChanhe(Double procent){
        price = price-price*procent/100;
    }
    
    
    
}
