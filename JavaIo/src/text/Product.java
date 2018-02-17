/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author Cube
 */
public abstract class Product {
    
    private int number;
    private String type;
    private String brand;
    private double price;
    private String description;
    private boolean isInStock;

    public Product(int number, String type, String brand, double price, String description, boolean isInStock) {
        this.number = number;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.isInStock = isInStock;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isIsInStock() {
        return isInStock;
    }

    @Override
    public String toString() {
        return  number + " " + type + " " + brand + " " + price + " " + description + " " + isInStock;
    }
    
    
    
    
    
}
