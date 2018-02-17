
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cube
 */
public final class PayrollEntry {

    private final Employee employee;
    private final BigDecimal salaryPlusBonus;

    public PayrollEntry(Employee employee1, BigDecimal salary, BigDecimal bonus) {
        if (bonus == null) {
            bonus = BigDecimal.valueOf(0);
        }
        if (salary == null) {
            salary = BigDecimal.valueOf(0);
        }

        employee = employee1;
        salaryPlusBonus = salary.add(bonus);

    }

    public Employee getEmployee() {
        return employee;
    }

    public BigDecimal getSalaryPlusBonus() {
        return salaryPlusBonus;
    }
    

    

}
