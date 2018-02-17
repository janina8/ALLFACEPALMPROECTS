
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

public Desk desk;
public Controller controller;

public void safeStart() {
    
     controller.safeOpen();
     desk.passwordEnter();
     controller.putOrTake();
     
    }
  

   
}
    

