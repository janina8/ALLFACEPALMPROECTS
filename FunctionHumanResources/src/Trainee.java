
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
public class Trainee extends Employee {
    
    private Date practiceStartDate;
    private int practiceLength;

    public Trainee(Date practiceStartDate, int practiceLength, String firstName, String surname, Date dateOfBirth, double age, BigDecimal salary, Manager manager) {
        super(firstName, surname, dateOfBirth, age, salary, manager);
        this.practiceStartDate = practiceStartDate;
        this.practiceLength = practiceLength;
    }

    @Override
    public String toString() {
        return "Trainee{" + "practiceStartDate=" + practiceStartDate + ", practiceLength=" + practiceLength + '}';
    }




 


}