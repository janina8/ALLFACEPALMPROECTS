/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Hero hero = new Hero("Бог Хаоса", 10, 98);
        Arms arm1 = new Arms("дубинка", 5);
        Arms arm2 = new Arms("нунчаки", 5);
        Arms arm3 = new Arms("узи", 5);

        hero.addArm(arm1);
        hero.addArm(arm2);
        hero.addArm(arm3);

        System.out.println(hero);

        Hero clone = hero.clone();
        System.out.println(clone);

        clone.setName("Злой брат близнец");
        clone.addArm(arm1);
        System.out.println(clone);
        System.out.println(hero);
        
        Trump trump = new Trump();
        System.out.println(trump);
        Trump clon = trump.clone();
        System.out.println(clon);
        
        Kura kura = new Kura(5, 5, "sweet", "Kokokoko!");
         Kura kuraClone = new Kura(kura);
         
         System.out.println(kuraClone);
        
    }

}
