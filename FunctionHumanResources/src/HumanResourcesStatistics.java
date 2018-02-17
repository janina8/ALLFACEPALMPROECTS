
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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
public final class HumanResourcesStatistics {
 //  Employee employee;
    public static List<PayrollEntry> payroll(List<Employee> employees) {
        
        //Employee[] ar1 = employees.toArray(new Employee[employees.size()]);

        Stream<Employee> stream = employees.stream();
        Function<Employee, PayrollEntry> function = new Function<Employee, PayrollEntry>() {
            @Override
            public PayrollEntry apply(Employee t) {
               if(t instanceof Worker)
                   return new PayrollEntry(t, t.getSalary(), t.getBonus());
               else return new PayrollEntry(t, t.getSalary(), null);
            }
        };
        stream.map(mapper)

        //   Predicate<Employee> predicate = (a) -> employee.getFirstName().length() > 5;
        Arrays.stream(ar1)
                .filter((o) -> o.getAge() > 5)
                .forEach(p -> System.out.println(p));
       collect();   
        return null;

    }

    public static List<PayrollEntry> subordinatesPayroll(Manager manager) {
          
        
        return null;
    }


    public static BigDecimal bonusTotal(List<Employee> employees) {
        return null;
    }

    public static List<PayrollEntry> стаж(List<Employee> employees) {
        return null;
        //	1 перевести в стрим
        //	2 сделать форич для листа эмплоеров
        //	3 вернуть лист, в котором будет сотрудник с самым большим стажем
//	}

        /// ...
        // rest of the methods specified in the assignment description
    }

}
