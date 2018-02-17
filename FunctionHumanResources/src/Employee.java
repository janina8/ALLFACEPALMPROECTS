
import java.math.BigDecimal;
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
public class Employee extends Person {
    
    private BigDecimal salary;
    private Manager manager;
    
    public Employee(String firstName, String surname, Date dateOfBirth, double age, BigDecimal salary, Manager manager) {
        super(firstName, surname, dateOfBirth, age);
        this.salary = salary;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", manager=" + manager + '}';
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Manager getManager() {
        return manager;
    }
    
}
