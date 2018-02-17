/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public abstract class Product {
    
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }
    
    
}
