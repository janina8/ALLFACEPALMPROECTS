/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Supermarcket {
    
    private Dispetcher dispetcher;
    private FoodDept foodDept;
    private SportDept sportdept;
    private ToyDept toyDept;

    public Supermarcket() {
        this.foodDept = new FoodDept();
        this.sportdept = new SportDept();
        this.toyDept = new ToyDept();
        this.dispetcher = new Dispetcher();
       
    }
    
   public void dispetcherTakeProduct(Product product){
        dispetcher.takeProduct(product);
   }
   
    @Override
    public String toString() {
        return foodDept.toString()+ sportdept+toyDept;
    }
    
    public class Dispetcher {
        public void takeProduct(Product product) {
            if (product instanceof Food) {
                Food food = (Food) product;
                foodDept.addFood(food);
            }
            if (product instanceof Toy) {
                Toy toy = (Toy) product;
                toyDept.addToy(toy);
            }
            if (product instanceof Sport) {
                Sport sport = (Sport) product;
                sportdept.addSport(sport);
            }
        }
    }
}
