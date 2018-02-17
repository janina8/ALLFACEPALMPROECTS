/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainLambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Cube
 */
public class Order {
    private int number;
    private String client;
    private Date dateOfOrder;
    private Employee manager;
    private ArrayList<OrderItem>products;


    public Order(String client, Employee manager, Date dateOfOrder) {
        this.client = client;
        this.manager = manager;
        Random random = new Random();
        this.number = random.nextInt(12546);
        this.dateOfOrder = dateOfOrder;
        this.products = new ArrayList<>();
    }

 

    public int getNumber() {
        return number;
    }

    public String getClient() {
        return client;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public Employee getManager() {
        return manager;
    }

    public ArrayList<OrderItem> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" + "number=" + number + ", client=" + client + ", dateOfOrder=" + dateOfOrder + ", manager=" + manager + ", products=" + products + '}';
    }
    
    public void addProduct(Product product, int number){
        OrderItem oi = new OrderItem(product, number);
        if(products.contains(oi)){
            int index = products.indexOf(oi);
            OrderItem sel = products.get(index);
            sel.addQuantity(number);
            //products.get(products.indexOf(oi)).addQuantity(number);
        }
       else
            products.add(oi);
    }
    
    public BigDecimal totalPrice() {
     
  /* 
        Stream<OrderItem> stream = products.stream();
        Function<OrderItem, BigDecimal> mapper = new Function<OrderItem, BigDecimal>(){
            @Override
            public BigDecimal apply(OrderItem t) {          // принимает 1 формат, а возвращает другой тип.
                return t.total();
            }
            
        };
         
        
        Function<OrderItem, BigDecimal> mapper1 = (t)-> t.total();
        
        Stream<BigDecimal> stream1 = stream.map((t)-> t.total()); */
      
        //return stream1.reduce((t, u) ->  t.add(u)).get();                               //reduce совершает действия над всеми эллементами, нужен метод get() чтобы вернуть нужный тип, иначе в Obcional
       return  products.stream()
               .map((t)-> t.total())
               .reduce((t, u) ->  t.add(u)).get();  
      

    }

    
    public void discount(int discount){
        for(OrderItem oi:products){
            
            oi.getProduct().disCount(discount);
        }
        //products.stream().map(t->t.getProduct()).peek(t->t.disCount(discount));
    }
}
