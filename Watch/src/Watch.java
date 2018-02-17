
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Watch {
    private Date currentTime;
     private Mechanism mechanism;
     private Display display;

    public Watch() {
        
        this.mechanism = new Mechanism();   // создаем объекты сразу в конструкторе потому, что создать отдельно не получиться в приватных классах
        this.display = new Display();
       
    }
     

    private class Display {

        public void show(String info){
            System.out.println(info);
        }
    }
    
    public void showTime() {
        mechanism.setTime();
        display.show(currentTime.toString());  //перевели в Стринг из типа Date
    }
    
    public class Mechanism {

        public void setTime() {
            currentTime = new Date();
        }
    }
}
