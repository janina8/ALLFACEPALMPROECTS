/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class CoffeMachine {
    
    private int sugarQuantity, creamQuantity, lemonQuantity;
    
    
    
    
    public void addSugar(){
        this.sugarQuantity++;
    }
    
     public void subSugar(){
         if(sugarQuantity > 0){
            this.sugarQuantity--;
        }
    }
    
      public void addCream(){
        this.creamQuantity++;
    }
    
    public void subCream() {
        if (creamQuantity > 0) {
            this.creamQuantity--;
        }

    }
    
     public void addLemon(){
        this.lemonQuantity++;
    }
    
    public void subLemon() {
        if (lemonQuantity > 0) {
            this.lemonQuantity--;
        }
    }

    public Cup makeDrink(String button){
        
        Cup cup = new Cup();
        Ingridient water = new Ingridient("water");
        cup.addIngridient(water);
        for (int i = 0; i < sugarQuantity; i++) {
            Ingridient sugar = new Ingridient("sugar");
            cup.addIngridient(sugar);
           
        }
        
        if(button.equals("late")){
            cup.setDrinkType("late");
            Ingridient coffe = new Ingridient("coffe");
            cup.addIngridient(coffe);
            if(creamQuantity < 3){
                for(int i = 0; i < creamQuantity;i ++){
                    Ingridient cream = new Ingridient("cream");
                    cup.addIngridient(cream);
                     
                }
            }
            
        }
        
        
        if (button.equals("tea")) {
            cup.setDrinkType("tea");
            Ingridient tea = new Ingridient("tea");
            cup.addIngridient(tea);
            if (creamQuantity < 2) {
                for (int i = 0; i < lemonQuantity; i++) {
                    Ingridient lemon = new Ingridient("lemon");
                    cup.addIngridient(lemon);
                }
            }

        }
     
        if (button.equals("americano")) {
            cup.setDrinkType("americano");
            Ingridient coffe = new Ingridient("coffe");
            cup.addIngridient(coffe);

        }

        return cup;

    }
    

}
