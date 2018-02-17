/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class RadioFlashligt {
    private Flashlight flashlight;
    private Radio radio ;
     private Display display;
    
    
    //Производство радиофонаря на фабрике
    public RadioFlashligt(Display display, Flashlight flashlight, Radio radio) {
        this.display = new Display();
        this.flashlight = flashlight;
        this.radio = radio;
    }
    //Приобретаем готовый обект радиофонаря
    public RadioFlashligt (){
        this.display = new Display();
        this.radio = new Radio(true, 10, 1, 5, 5.5, 50.0, 1.5);
        this.flashlight = new Flashlight(true);
    }
   
    //Специфический фонарь под заказ с определенными параметрами
    public RadioFlashligt(int minVolume, int maxVolume){
        this.display = new Display();
        this.radio = new Radio(false, maxVolume, minVolume, 0, 5.5, 40.5, 1.5);
    }
    //Создание пустого фонаря с дисплеем, с последующим добавлением деталей
    public RadioFlashligt(int type){
        this.display = new Display();
    }
    public void setRadio(Radio radio){
        this.radio = radio;
    }
    public void setFlashLight(Flashlight flashLight){
        this.flashlight = flashlight;
    }
    public void radioOn() {
        radio.radioOn();
    }
    
   public void changeRadiostation (double waves){
       if (waves > 0){
       radio.radiostationIncreace(waves);
       }
       else {
           radio.radiostationDecreace(waves);
       }
       
       display.show(radio.radioStation());
   }
    
}
