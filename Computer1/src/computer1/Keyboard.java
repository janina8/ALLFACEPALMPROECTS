/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer1;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Cube
 */
public class Keyboard {

   
private String name;
    public Keyboard(boolean isSwichOn) {
      
        this.isSwichOn = isSwichOn;
    }
    
    
    
   public String write() {
    
       System.out.println("Напишите, что вы хотите распечатать:");
    Scanner scanner = new Scanner(System.in);
    String printout = scanner.nextLine();
    return printout;
   }
    
    private boolean isSwichOn;
    
    public void swichOn() {
        this.isSwichOn = true;
    }
    
    public void swichOff() {
        isSwichOn = false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Keyboard other = (Keyboard) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}