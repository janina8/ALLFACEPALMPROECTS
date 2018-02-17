/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testExeption;

/**
 *
 * @author Cube
 */
public class Brain {
    
    
    private Head head;
    
    private Boolean isHealth = true;

    public void setHead(Head head) {
        this.head = head;
    }

 

    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }
     
    public void deleteEat(){
       head.setColor1("red");
       
    }
      
}
