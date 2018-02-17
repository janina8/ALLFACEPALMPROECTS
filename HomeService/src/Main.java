
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Order order = new Order("Petja", "Pushkina ulica");
        order.addProblem("electric");
        order.addProblem("build");

        Order order2 = new Order("Vasja", "Lenina");
        order2.addProblem("build");

        HomeService hs = new HomeService();
        hs.receiveOrder(order);

        hs.receiveOrder(order2);
        hs.printStatic();

      //  System.out.print(electricDepartament.getListElectricOrders());

        //  HashMap hm = new HashMap();
        // Order order2 = new Order("Ola", "dom Kolotushkina","Elsectric departament");
        // list.add("Elsectric departament");
    }
}
    

