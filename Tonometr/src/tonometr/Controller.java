/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

/**
 *
 * @author Cube
 */
public class Controller {
    
    
    private Display display;

    public Controller(Display display) {
        this.display = display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    
 
   
    
    public void analize(int preassure1, int preassure2, int pulse) {
        if (preassure1 > 200) {
            display.show("Верхнее давление завышено, идите к врачу.");
        } else {
            display.show("Верхренее давление равно: " + preassure1);
        }
        if (preassure2 > 100) {
            display.show("Нижнее давление завышено, идите к врачу.");
        } else {
            display.show("Нижнее давление равно: " + preassure2);
        }
        if (pulse > 90) {
            display.show("Пульс завышен, идите к врачу.");
        } else {
            display.show("Пульс равен: " + pulse);

        }

    }

}
