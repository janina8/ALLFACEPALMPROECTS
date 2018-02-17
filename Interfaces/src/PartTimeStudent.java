/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class PartTimeStudent extends Student {

    public PartTimeStudent(String univercity, String name, int id) {
        super(univercity, name, id);
    }

    @Override
    public void study() {
        super.study(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("but vary bad");
    }
    
    
    
}
