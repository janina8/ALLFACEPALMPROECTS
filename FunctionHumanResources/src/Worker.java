
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
public class Worker extends Employee{
    
    private Date employmentDate;
    private BigDecimal bonus;

    public Worker(Date employmentDate, int bonus, String firstName, String surname, Date dateOfBirth, double age, BigDecimal salary, Manager manager, BigDecimal bonus) {
        super(firstName, surname, dateOfBirth, age, salary, manager);
        this.employmentDate = employmentDate;
        this.bonus = bonus;
    }



    public Date getEmploymentDate() {
        return employmentDate;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Worker{" + "employmentDate=" + employmentDate + ", bonus=" + bonus + '}';
    }
    
  
   
}
