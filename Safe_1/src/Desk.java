
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
public class Desk {
    private Safe safe;
    public String password;
    //public Controller controller;

    public void setSafe(Safe safe) {
        this.safe = safe;
    }

   /* public Desk(Safe safe) {
        this.safe = safe;
    }*/

    public void passwordEnter(String pass) {
            safe.
        if (controller.isOpen = true) {
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
}
