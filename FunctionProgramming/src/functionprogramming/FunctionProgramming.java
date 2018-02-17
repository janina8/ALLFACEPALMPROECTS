/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionprogramming;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Cube
 */
public class FunctionProgramming  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumer<Person> consumer1 = new Consumer<Person>() {
            @Override
            public void accept(Person t) {
                System.out.println(t);
            }
        };
        Consumer<Date> date1 = new Consumer<Date>() {
            @Override
            public void accept(Date t) {

                System.out.println(t);

            }
        };

        Person person = new Person("Petya", 5, 3.3333);
        Consumer<Person> consumer2 = (t) -> System.out.println(t);
        consumer2.accept(person);

        Predicate<Person> predicate1 = (t) ->  t != null;
        System.out.println(predicate1.test(null));
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        
      
        
        Function <Person, Date> function1 = new Function<Person, Date>(){
            @Override
            public Date apply(Person t) {
                System.out.println(t);
                return new Date();
            };
    };
        Function <Person, String> function2 = (Person t) -> formatter.format(new Date());
        System.out.println(function2.apply(person));
        
        
        DoubleSupplier doubleSupplier = ()-> person.getSalary();
        System.out.println(doubleSupplier.getAsDouble());
        
        Date date = new Date();
       
        BiPredicate<Person, Date> biPredicate = (Person t, Date u)-> u!=null&t!=null;
                
        System.out.println(biPredicate.test(person, date));
        
        Supplier<Person> supplier2 = () -> new Person("Valsa", 0, 0);

        Supplier<Person> supplier3 = () -> person;

        Supplier<Person> supplier = new Supplier<Person>() {
            @Override
            public Person get() {
                return person;
            }
        };
        System.out.println(supplier.get());
    }


}

