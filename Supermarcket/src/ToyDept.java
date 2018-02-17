
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
public class ToyDept {
    private ArrayList<Toy> products ;      //= new ArrayList<>();
    
    public ToyDept(){
        this.products = new ArrayList<>();
    }
    
    public void addToy(Toy toy){
        products.add(toy);
    }
    
       @Override
    public String toString() {
        String info = "Toy department contains: \n";
        for (int i = 0; i < products.size(); i++) {
            info = info + products.get(i)+"\n";
        }
        return info;

    }
    
}
