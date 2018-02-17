/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainLambda;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Cube
 */
public class Product {
    
    private BigDecimal price;
    private String brand;
    private Date expDate;

    public Product(BigDecimal price, String brand, Date expDate) {
        this.price = price;
        this.brand = brand;
        this.expDate = expDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public Date getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", brand=" + brand + ", expDate=" + expDate + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj  instanceof Product))
            return false;
        Product p = (Product) obj;
        return (p.getPrice() != this.price) && p.getBrand() != null && p.getBrand().equals(brand);
//        if (p.getPrice() != this.price)
//            return false;
//        if(!(p.getBrand().equals(brand)))
//            return false;
//        else return true;
        //return super.equals(obj)
    }

    @Override
    public int hashCode() { //задает одинаковые значения для хешкода, объектам  содинакомыми полями
        // 17, 31, 67 ....
      int hashCode = 31;
      hashCode = 31* hashCode + price.hashCode();
      hashCode = (brand == null) ? hashCode : 31 * hashCode + brand.hashCode();
      return hashCode;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    
    
    public void disCount(double discount){
      //  price = price - price * discount/100;
        double a = price.doubleValue();
        a = a - a * discount/100;
        price = BigDecimal.valueOf(a);
      
    }
}
