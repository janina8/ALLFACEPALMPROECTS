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

    public static void main(String[] args) {

        Office office = new Office();

      
       
        Manager manager = new Manager("Иван Петров", 400);
        Receptionist receptionist = new Receptionist("Василиса Васильневна", 350);
        Security security = new Security("Плотва Кукарека", 200);

         office.addEmployee(Accountant.getAccountant("Маша", 300));
           office.addEmployee(Accountant.getAccountant("Вася", 300));
             office.addEmployee(Accountant.getAccountant("Петя", 500));
               office.addEmployee(Accountant.getAccountant("Кура", 500));
      
               office.addEmployee(GeneralDirector.getGeneralDirector("Полковник", 33333));
        office.addEmployee(GeneralDirector.getGeneralDirector("Петя", 36300));
       
        office.addEmployee(manager);
        office.addEmployee(receptionist);
        office.addEmployee(security);

        office.printStuff();
    }
}
