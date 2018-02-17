/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Boat {
    
    private String name;
    
    private String price;

    public Boat(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
    
    
    
    public void swim(){
        System.out.println(name+ " поплыла");
    }
    
     public void stop(){
        System.out.println(name+ " остановилась");
    }
}
