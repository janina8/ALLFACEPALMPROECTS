
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class SantexDepartament {

    private ArrayList<Order> listSantexOrders = new ArrayList<>();

    private String santexDepartament = "Santex Departament";
    
    
    public void addOrder(Order order) {
        listSantexOrders.add(order);
        
    }

    public String getSantexDepartament() {
        return santexDepartament;
    }

    public String info(){
        String info = "Santex department: \n Orders:\n Quantity = "+ listSantexOrders.size();
        for(Order o: listSantexOrders){
            info = info + o.getName()+" "+ o.getAdress()+" \n";
        }
        return info;
    }

}
