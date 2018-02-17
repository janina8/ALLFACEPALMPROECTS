/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class WaterPlane {
    
    private String name;
    
    private Plane plane;
    private Boat boat;

    public WaterPlane(String name, String planeName, String planePrice) {
        this.name = name;
        this.plane = new Plane(planeName, planePrice);
        this.boat = new Boat("Лодка", "55543");
    }
    
    
     public void stop(){
        System.out.println(name+ " остановилась");
    }
    
     public void fly(){
         System.out.println(name+ " трансформировалась в "+plane.getName());
         plane.fly();
     }
     
     public void swim(){
         System.out.println(name+ " трансформировалась в "+boat.getName());
        boat.swim();
     }
}
