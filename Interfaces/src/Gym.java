
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
public class Gym {
    
  
    
  /*  public void competitions(Student student, Sportsman sportsman, Worcker worcker, PartTimeStudent partTimeStudent, Musician musician) {
            System.err.println("Идут соревнования между след. участниками: "+student.getName()+sportsman.getName()+worcker.getName()+partTimeStudent.getName()+musician.getName());
}
*/    
    
    
    
    private ArrayList<Sportsman>list = new ArrayList<>();
    
    public void addPerson(Sportsman sportsman){
        list.add(sportsman);
        
    }
   
    public void  competitions() {
    System.err.println("Идут соревнования между след. участниками:");
        for (Sportsman a : list) {
           a.trains();
        }
    }
}

