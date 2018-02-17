
import java.util.ArrayList;
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
public class ElectricDepartament {
        
    
    private ArrayList<Order> listElectricOrders = new ArrayList<>();

    private String electricDepartament = "Electric departament";
    
    public String info(){
        String info = "Electric department: \n Orders:\n Quantity = "+ listElectricOrders.size();
        for(Order o: listElectricOrders){
            info = info + o.getName()+" "+ o.getAdress()+" \n";
        }
        return info;
    }
    
    
    /* HashMap hm = new HashMap();
    hm.put(electricDepartament); */

    public void addOrder(Order order) {
        listElectricOrders.add(order);
        
    }
  
    
    
    
}
