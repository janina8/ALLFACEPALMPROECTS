/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.Comparator;

/**
 *
 * @author Cube
 */
public  class Product {
    
   private int price;
   private String name;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    
    public Product(int price, String name) {
        this.price = price;
        this.name  = name;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", name=" + name + '}';
    }


    
}
