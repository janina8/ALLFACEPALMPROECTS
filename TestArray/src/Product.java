
import java.util.Objects;

enum ProductType{FOOD, CLOTHES, TECHNIC, PARFUM}

public class Product {
    public static final int FOOD = 25;
    public static final int CLOTHES = 157854;
    public static final int PARFUM = 784854;
    
    private ProductType productType;
    private String name;
    private double price;

    public Product(ProductType productType, String name, double price) {
        this.productType = productType;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productType=" + productType + ", name=" + name + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.productType);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final Product other = (Product) obj;
        return true;
    }
    
    
}
