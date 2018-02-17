/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Objective {
    
    public int zoom;

    public Objective(int zoom) {
        this.zoom = zoom;
    }
   
    public void decreaseZoom(){
        zoom = zoom - 1;
        System.out.println("Zoom = "+zoom);
    }

    public void zoom() {
    
        zoom = zoom++;
        System.out.println("Zoom = "+zoom);
    }
}
