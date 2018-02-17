
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
public class Office {
   
   private ArrayList<Employee>stuff = new ArrayList<>();
   
   public void addEmployee(Employee employee){
       stuff.add(employee);
       
       
   }

   public void printStuff(){
       
       for(Employee employee: stuff){
           System.out.println(employee);
       }
   }
  
}
