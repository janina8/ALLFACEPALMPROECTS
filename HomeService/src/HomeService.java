
import java.util.ArrayList;
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
public class HomeService {
    
    private ElectricDepartament electricDepartament;
    private BuildDepartament buildDepartament;
    private SantexDepartament santexDepartament;
    private Dispatcher dispatcher;

    public HomeService() {
        this.electricDepartament = new ElectricDepartament();
        this.buildDepartament = new BuildDepartament();
        this.santexDepartament = new SantexDepartament();
        this.dispatcher = new Dispatcher();
    }
     
    private class Dispatcher {

        public void analize(Order order) {
         
            ArrayList<String> problems = order.getList();
            for (String currentProblem:problems) {
    //        for (int i = 0; i < problems.size(); i++) {
         //       String currentProblem = problems.get(i);
                if (currentProblem.equals("electric")) {
                    electricDepartament.addOrder(order);
                }
                if (currentProblem.equals("build")) {
                    buildDepartament.addOrder(order);
                }
                if (currentProblem.equals("santex")) {
                    santexDepartament.addOrder(order);
                }
            }

        }
    }

        public void receiveOrder(Order order) {

            dispatcher.analize(order);

        }

        public void printStatic() {

            System.out.println("HomeService:\n" + buildDepartament.info() + "\n" + electricDepartament.info() + "\n" + santexDepartament.info());

        }
    }


