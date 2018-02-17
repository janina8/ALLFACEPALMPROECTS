
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
public class Safe {

    public boolean isOpen;
    public String password;
    public int sum = 500;

    public void safeOpen() {
        this.isOpen = true;
    }

    public void safeClose() {
        this.isOpen = false;
    }

    public void passwordEnter() {

        if (isOpen = true) {
            System.out.println("Введите пароль: ");

            Scanner input = new Scanner(System.in);

            String pass = input.nextLine();

            if (pass.equals(password)) {
                System.out.println("Сейф открыт");
            } else {
                System.out.println("Неверно!");
            }
        } else {
            System.out.println("Сейф закрыт");

        }
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
        
    
    
    
    
  
    public Safe() {
        this.password = "12345";
        this.sum = 500;
    }

   
}
    

