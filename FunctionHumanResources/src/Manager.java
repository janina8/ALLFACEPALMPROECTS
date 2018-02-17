
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cube
 */
public class Manager extends Worker {

    private ArrayList<Employee> subordinates;
    private ArrayList<Employee> allSubordinates;//у кого в подчинении менжер

    public Manager(Date employmentDate, BigDecimal bonus, String firstName, String surname, Date dateOfBirth, double age, BigDecimal salary, Manager manager) {
        super(employmentDate, bonus, firstName, surname, dateOfBirth, age, salary, manager);
        this.subordinates = new ArrayList<>();
        this.allSubordinates = new ArrayList<>();
    }



    public void addToSubordinatesList(Employee employee) {
            subordinates.add(employee);
        }
       
    
    
       public void addToAllSubordinates(Employee employee) {
            allSubordinates.add(employee);
        }

    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }

    public ArrayList<Employee> getAllSubordinates() {
        return allSubordinates;
    }
       
       
       
       
       
}
     
 
  

