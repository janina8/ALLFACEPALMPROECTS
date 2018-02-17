
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class SportDept {
    private ArrayList<Sport> products ;      //= new ArrayList<>();
    
    public SportDept(){
        this.products = new ArrayList<>();
    }
    
    public void addSport(Sport sport){
        products.add(sport);
    }
       @Override
    public String toString() {
        String info = "Sport department contains: \n";
        for (int i = 0; i < products.size(); i++) {
            info = info + products.get(i)+"\n";
        }
        return info;

    }
    
}
