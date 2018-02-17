/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainLambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cube
 */
public class Main {

    public static void main(String[] args) {

        Product product = new Product(BigDecimal.valueOf(1000), "Kura", new Date(2017 - 1900, 2, 3));
        Product product2 = new Product(BigDecimal.valueOf(15), "Kura2", new Date(2017 - 1900, 2, 3));

        Employee manager = new Employee("Менежер");
        Order order = new Order("Петя", manager, new Date(2017 - 1900, 05, 01));
        Order order2 = new Order("Вася", manager, new Date(2017 - 1900, 06, 05));
        Order order3 = new Order("Кур", manager, new Date(2018 - 1900, 01, 01));
        Order order4 = new Order("Василиса", manager, new Date(2017 - 1900, 02, 21));

        order.addProduct(product, 2);
        order.addProduct(product2, 1);
        order2.addProduct(product2, 1);
        order3.addProduct(product2, 1);
        order4.addProduct(product, 10);
        List<Order> allOrders = Arrays.asList(order, order2, order3, order4);

        List<Order> list = OrderAnalisator.findOrdersByClientName("Вася", allOrders);
   //     list.stream().forEach((t) -> System.out.println(t));

        Order order10 = OrderAnalisator.findExpenciveOrder(allOrders);

        System.out.println(order10);
        //   System.out.println(allOrders);

    }

}
