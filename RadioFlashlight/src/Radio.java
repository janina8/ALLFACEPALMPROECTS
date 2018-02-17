
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
public class Radio {

    public boolean onMusic;

    public int currentVolume;
    public int maxVolume;
    public int minVolume;

    public double currentRadioWave;
    public double maxRadioStation;
    public double minRadioStation;
    
    
    public void radioOn() {
        this.onMusic = true;
        System.out.println("Radio is ON"+ currentRadioWave);
    }

    public int increaseVolume(int decibeles) {
        if ((currentVolume + decibeles) <= maxVolume) {
            return currentVolume += decibeles;
        } else {
            return maxVolume;
        }
    }
    
       public int decreaceVolume(int decibeles) {
        if ((currentVolume - decibeles) >= minVolume) {
            return currentVolume -= decibeles;
        } else {
            return minVolume;
        }
    }
    
     public double radiostationIncreace(double wave) {
         if ((currentRadioWave + wave) <= maxRadioStation) {
            return currentRadioWave = currentRadioWave + wave;
        } else {
            return maxRadioStation;
        }
     }
     
      public double radiostationDecreace(double wave) {
         if ((currentRadioWave - wave) >= minRadioStation) {
            return currentRadioWave -= wave;
        } else {
            return minRadioStation;
        }
     }
      
    public String radioStation() {
        if (currentRadioWave == 34.5) {
            return "RADIO: ЭХО МОСКВЫ";
        }
        if (currentRadioWave == 24.1) {
            return "RADIO: СВОБОДА";
        }
        if (currentRadioWave == 12.5) {
            return "RADIO: SWH+" ;
        }
        else
            return "NOT FOUND";
    }
            
    

            
            
    public Radio(boolean onMusic, int maxVolume, int minVolume, int currentVolume, double currentRadioStation, double maxRadioStation, double minRadioStation) {
        this.onMusic = onMusic;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentRadioWave = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;

    }

}
