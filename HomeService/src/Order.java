import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Order {
    
        private String name;
        private String adress;
      private ArrayList<String> problems;
        


    public Order(String name, String adress) {
        this.problems = new ArrayList<String>();
        this.name = name;
        this.adress = adress;
    }
 
    public ArrayList<String> getList() {
        return problems;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setArrayList(ArrayList arrayList) {
        this.problems = arrayList;
    }

      public void addProblem(String info){
         problems.add(info);
      }
          
                  
}
