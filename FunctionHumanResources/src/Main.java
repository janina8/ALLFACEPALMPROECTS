
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Employee> subordinates = new ArrayList<>();
        ArrayList<Employee> allSubordinates = new ArrayList<>();

        //1. Отфильтровать и вывести на консоль все телефоны с именами имеющими длину больше 7 символов
        Manager manager1 = new Manager(subordinates, allSubordinates, new Date(2021 - 1900, 05, 5), 343, "Василий", "Петрович", new Date(2041 - 1900, 05, 5), 343, BigDecimal.TEN, null);
        Manager manager2 = new Manager(subordinates, allSubordinates, new Date(2021 - 1900, 05, 5), 343, "Василий", "Петрович", new Date(2041 - 1900, 05, 5), 343, BigDecimal.TEN, null);

        Trainee trainee = new Trainee(new Date(2041 - 1900, 05, 5), 44, "Buka", "Юрьевич", new Date(2041 - 1900, 05, 5), 43, BigDecimal.TEN, manager1);
        Worker worker = new Worker(new Date(2041 - 1900, 05, 5), 4, "Kura", "Kurjevna,", new Date(2021 - 1900, 03, 1), 323, BigDecimal.ZERO, manager1);
        Employee employee = new Employee("Ola", "Olevna", new Date(2021 - 1900, 05, 5), 32, BigDecimal.TEN, manager1);

        allSubordinates.add(trainee);
        allSubordinates.add(worker);
        allSubordinates.add(employee);
        allSubordinates.add(manager1);
        
        
    PayrollEntry payrollEntry = new PayrollEntry(employee, BigDecimal.valueOf(12122.65), BigDecimal.TEN);
   PayrollEntry payrollEntry2 = new PayrollEntry(manager1, BigDecimal.valueOf(9122.65), BigDecimal.TEN);
  

   
       payrollEntry.vivestiPodlone(allSubordinates);


        HumanResourcesStatistics humanResourcesStatistics = new HumanResourcesStatistics();

        humanResourcesStatistics.payroll(allSubordinates);
  //      HumanResourcesStatistics.bonusTotal(allSubordinates);


  //      Employee[] ar1 = allSubordinates.toArray(new Employee[allSubordinates.size()]);

  //      Stream<Employee> stream = Arrays.stream(ar1);

       // Predicate<Employee> predicate = (a) -> employee.getFirstName().length() > 5;

  //      Arrays.stream(ar1)
  //              .forEach(p -> System.out.println(p));

    }
}
