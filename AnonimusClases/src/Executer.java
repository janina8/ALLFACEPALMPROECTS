/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Executer {
    
    public void execute(Action a){
        System.out.println("Action запустился");
    }
    
    public double executeAction4(Action4 a, Person b){
        return 1.31+a.exucete(b);
    }
}
