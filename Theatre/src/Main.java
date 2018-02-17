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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Theatre theatre = new Theatre();
        Pensioner pensioner = new Pensioner(" Шурик");
        Doctor doctor = new Doctor(" Марфуша");
        Pilot pilot = new Pilot(" Ибрагим");
        Stewardess stewardess = new Stewardess(" Катюша");
         
       theatre.addViewer(pilot);
        theatre.addViewer(pilot);
           theatre.addViewer(doctor);
              theatre.addViewer(pensioner);
                 theatre.addViewer(stewardess);
                 theatre.startShow();
                 
                 theatre.showSize();
                 
    }
    
}
