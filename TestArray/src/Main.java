
import java.util.ArrayList;
import java.util.HashSet;

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
        
        ArrayList<ExampleObject> exList = new ArrayList<>();
        ExampleObject exampleObject = new ExampleObject("Kokoko");//1
        exList.add(exampleObject);//2
        exList.add(exampleObject);//3
        ExampleObject exampleObject2 = new ExampleObject("Kokoko");//4
        exList.add(exampleObject2);//5
        System.out.println(exList.size()); 
        exampleObject = null;
        exList.add(null);
        exList.add(0,null);
        ExampleObject oldRef = exList.set(1, new ExampleObject("vasya")); // при сетере можно вписать старое значение присваеванием
        oldRef.getName();
        System.out.println(exList.contains(null));
        
       Object [] mas = exList.toArray();
       
       exList.remove(exampleObject);
       ExampleObject [] mas2 = exList.toArray(new ExampleObject[1]); //перевести в массив 
       System.out.println(mas2.length);
       
       HashSet<ExampleObject> set = new HashSet<>(); //дубликаты не добавляет
       set.add(oldRef);set.add(oldRef);
       
       System.out.println(set.size());
    }
    
}
