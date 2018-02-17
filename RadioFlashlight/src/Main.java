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
    public static void main(String[] args) {
        //купили фонарь
        RadioFlashligt radioFlashligt0 = new RadioFlashligt();
        radioFlashligt0.radioOn();
        
        
     
        
        // фабрика
        
        Radio radio = new Radio(true, 30, 5, 2, 10.5, 40.5, 1.5);
        Flashlight flashlight = new Flashlight(true);
        Display display = new Display();
        
        RadioFlashligt radioFlashligt = new RadioFlashligt(display, flashlight, radio);
        radioFlashligt.radioOn();
        
        radioFlashligt.changeRadiostation(7.0);
        radioFlashligt.radioOn();
        
        // 4 способ
        RadioFlashligt radioFlashligt1 = new RadioFlashligt(3);
        Radio newRadio = new Radio(true, 30, 5, 2, 1.0, 40.5, 1.5);
        Flashlight flashlight1 = new Flashlight(true);
        radioFlashligt1.setRadio(newRadio);
        radioFlashligt1.setFlashLight(flashlight1);
        radioFlashligt1.radioOn();
        radioFlashligt1.changeRadiostation(33.5);
    }
}

