/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class GeneralDirector extends Employee {

    private static GeneralDirector generalDirector;


    public static GeneralDirector getGeneralDirector(String name, int salary) {
        if (generalDirector == null) {
            generalDirector = new GeneralDirector(name, salary);
        }
        return generalDirector;

    }

    private GeneralDirector(String name, int salary) {
        super(name, salary);
    }

    
 
  
    
}
