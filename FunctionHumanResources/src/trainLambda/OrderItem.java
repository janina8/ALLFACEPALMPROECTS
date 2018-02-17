/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainLambda;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Cube
 */
public class OrderItem {
    
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderItem other = (OrderItem) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    public void addQuantity(int number) {
        
        this.quantity = this.quantity + number;
           }


    
    public BigDecimal total() {

        return product.getPrice().multiply(BigDecimal.valueOf(quantity));

    }

}
