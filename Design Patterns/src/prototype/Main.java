/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Cube
 */
public class Main {
    
    public static void main(String[] args) {
        Adress adress = new Adress("London", "Lenina", 666);
        DNA dna = new DNA(36, 10);
        
        Person original = new Person("Петя", 30, dna, adress, 401);
        System.out.println(original);
        
      /*  original.setDna(88);
        original.setName("Кура");
        original.setAge(66);
        original.setAdress("Moscow", "Pushkina", 555);
        System.out.println("");
        System.out.println(original);
        String name = original.getName();
        Adress adr = original.getAdress();
        int salary = original.getSalary();
        DNA dna1 = original.getDna();
        int age = original.getAge(); */
        
        
        //Person clone = new Person(name, age, dna1, adr, salary);
        Person clone = original.clone();
        
        
        System.out.println(clone);
        
        
        clone.setAdress("Ural", "Kolotushkina", 5);
        clone.setDna(39);
        
        System.out.println(clone);
        System.out.println();
        System.out.println(original);
    }
    
}
