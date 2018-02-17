/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Plane {
        
    private String name;
    
    private String price;
    
     public void fly(){
        System.out.println(name+ " полетела");
    }
     
      public void stop(){
        System.out.println(getName()+ " остановилась");
    }

    public Plane(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
      
      
}
