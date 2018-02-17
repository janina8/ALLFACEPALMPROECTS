/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainLambda;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Cube
 */
public class OrderAnalisator {
    
    public static List<Order> findOrdersByClientName(String client, List<Order> allOrders){
        
        return allOrders.stream()
                .filter((a)->a.getClient().equals(client))
                .collect(Collectors.toList());           // коллектор нужен чтобы перевести из стрима в коллекции
        
    }
    
    public static Order findExpenciveOrder(List<Order>allOrders){
        return allOrders.stream()
                .max((a, b)->a.totalPrice().compareTo(b.totalPrice())).get();
        
    }
    
    
//    public static int productsTotalSale(List<Order>allOrders){
//        return allOrders.stream().map()
//    }
    public static long countOrdersByClientName(String client, List<Order> allOrders){
        
        return  allOrders.stream()
                .filter((a)->a.getClient().equals(client))
                .count();
    }
    //Список менеджеров, которые оформили заказы на сумму больше 2000
    public static List<Employee> employeesFavour(Employee manager, List<Order>allOrders){
        
        return allOrders.stream()
                .filter((a)->a.totalPrice().doubleValue()>=2000)
                .map((a)->a.getManager())
                .collect(Collectors.toList());  //коллект собирает в арраулист
    } 
    //скидки на заказы даты которых в диапазоек 10/12/2017 и 25/12/2017 и сумма которых больше 5000
    public static List<Order> discountOrders(List<Order>allOrders, Date dateFrom, Date dateTo, int discount){
        return allOrders.stream()
                .filter((a)->a.getDateOfOrder().after(dateFrom) && a.getDateOfOrder().before(dateTo) && a.totalPrice().doubleValue() >5000) 
                .peek((a)->a.discount(discount))
                .collect(Collectors.toList());          
    }
    //Просмотреть список товарок, которые в ноябре 2017 года заказывались 3 и более раза
    
}
