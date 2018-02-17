
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
public class MacroCommand {
    
    private ArrayList<Action> actions = new ArrayList<>();
    
    
    
    public void addAction(Action action){
        actions.add(action);
    }
  
    public void execute(){
        
        for(Action a: actions)
        a.execute();
    }
}
