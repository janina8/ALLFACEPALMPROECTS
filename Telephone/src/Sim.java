/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Sim {
   private int number;
   private int sum;
   private String provider;
    
    public String connect(String calledNumber) {
        
        return "Соединяемся..."+provider + calledNumber;
    
    }
    
    public String disConnect() {
        
        return "Обонент отключился";
        
    }

    public Sim(int number, int sum, String provider) {
        this.number = number;
        this.sum = sum;
        this.provider = provider;
    }
    
  
}
