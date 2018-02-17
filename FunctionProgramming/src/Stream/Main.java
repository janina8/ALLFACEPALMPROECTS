/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream;

import functionprogramming.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Cube
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 25, 18, 15, 16, 18, -1, 0, 4, 1);
        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.distinct(); 
        
        System.out.println(s2.count()); //стрим умирает после вызова некоторых методов
        
        Stream<Integer> s3 = list.stream();
        Stream<Integer> s4 = s3.distinct();
        
        Predicate<Integer>predicate1 = (t) -> t > 15;
        Stream<Integer>s5 = s4.filter(predicate1);
   //     System.out.println(s5.count()); //каунт тоже убивает 
        
      //  Consumer<Integer> consumer = (t) -> t*10;
      //  Stream<Integer>s6 = s5.peek(consumer);
        
     //   Consumer<Integer> consumer2 = (t) -> System.out.println(t);
     // s6.forEach(consumer2);
 
        Function <Integer, Car> function2 = (Integer t) -> new Car(t);
    
     Stream<Car> s6 = s5.map(function2);
     
     Consumer<Car>consumer3 = (car) -> System.out.println(car);
        s6.forEach(consumer3);
    }
    
}
