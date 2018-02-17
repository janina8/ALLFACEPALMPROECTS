
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cube
 */
public class Controller {

    public boolean isOpen;
    private int sum;
    
    
    public void safeOpen() {
        this.isOpen = true;
    }

    public void safeClose() {
        this.isOpen = false;
    }

      public void takeMoney() {
         if (isOpen) {
            System.out.println("Введите сумму:");

            Scanner input1 = new Scanner(System.in);

            int sum1 = input1.nextInt();
            if (sum1 <= sum) {
                sum -= sum1;

                System.out.println("Баланс: " + sum);
            } else {
                System.out.println("Недостаточно денег");
            }
        }
    }
    
       public void moneyPut() {

        System.out.println("Какую сумму вы хотите положить?");

        Scanner input1 = new Scanner(System.in);

        int sum1 = input1.nextInt();
        sum = +sum1;
        System.out.println("Баланс: " + sum);
    }
        
    public void putOrTake(){
         Scanner input2 = new Scanner(System.in);
System.out.println("Выберите операцию: 1. Снять деньги. 2. Положить");
           int choice = input2.nextInt();
            
            if (choice == 1){
                takeMoney();
            }
            if (choice == 2) {
                moneyPut();
            }
            else 
                System.out.println("Операция не найдена.");
              putOrTake();
            }
    }

