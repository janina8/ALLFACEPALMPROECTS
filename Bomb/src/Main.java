
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
public class Main {

    public static int tryPass;

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard(123);
        Bomb bomb = new Bomb(keyboard);
        
        bomb.setTimer(15);
        bomb.start();
  
        /*Scanner input = new Scanner(System.in);
        System.err.println("Enter your password: ");
        tryPass = input.nextInt();
        
        if(tryPass == keyboard.getPassword()){
            bomb.bombOff();
        }
        else {
            System.err.println("ERROR. You will die.");
        }
*/
    }
}
