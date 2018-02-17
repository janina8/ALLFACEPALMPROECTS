
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
public class BuildDepartament {
    
         private ArrayList<Order> listBuildOrders = new ArrayList<>();
        
    
    
    public void addOrder(Order order) {
        this.listBuildOrders.add(order);
        
    }

      public String info(){
        String info = "Build department: \n Orders:\n Quantity =  "+ listBuildOrders.size()+"\n";
        for(Order o: listBuildOrders){
            info = info +" "+ o.getName()+" "+ o.getAdress()+" \n";
        }
        return info+"\n";
    }

        

}
