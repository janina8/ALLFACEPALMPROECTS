/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliteli;

import java.util.Scanner;

/**
 *
 * @author Cube
 */
public class Deliteli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int sum = 0;
        int count = 0;
        int n;
        int all = 0;
        
        
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Число " + n + " Делиться на нечетные делители: ");

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0 &
                i % 2 != 0) {
                 sum = sum + i;
                    count++;
                    System.out.print(i + " ");
                   

                           
                        
                    }
                }
            
     System.out.println("сумма нечетных делителей: " + sum);
        }
         

} 
      


