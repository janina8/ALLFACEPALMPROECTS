
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
public class Supermarket {

    private Controller controller;

    private FoodDepartament foodDepartament;
    private JevelryDepartament jevelryDepartament;
    private ToyDepartament toyDepartament;

    public Supermarket() {
        this.controller = new Controller();

        this.foodDepartament = new FoodDepartament();
        this.jevelryDepartament = new JevelryDepartament();
        this.toyDepartament = new ToyDepartament(); 
    
    }
    
    public void resieveProduct(Product product) {

        this.controller.productAnalize(product);

    }
    
    
    public void statistic() {
        int foodQuantity = foodDepartament.foodDepartamentSize();
        int jevelryQuantity = jevelryDepartament.jevelryDepartamentSize();
        int toyQuantity = toyDepartament.toyDepartamentSize();

        System.out.println("Количество товаров в департаменте еды: " + foodQuantity);
        System.out.println("Количество товаров в увелирном департаменте: " + jevelryQuantity);
        System.out.println("Количество товаров в департаменте игрушек: " + toyQuantity);
    }

    public class Controller {

        public void productAnalize(Product product) {

         
                String currentProductType = product.getProductType();
                if (currentProductType.equals("food")) {
                    foodDepartament.addProducts(product);
                    System.err.println("В отдел еды ");
                }

                if (currentProductType.equals("jevelry")) {
                    jevelryDepartament.addProducts(product);
                     System.err.println("В отдел еды ");

                }
                if (currentProductType.equals("toy")) {
                    toyDepartament.addProducts(product);
                     System.err.println("В отдел еды ");
                }

                System.out.println("В магазин поступила: " + currentProductType);
            }
        }
    }


