/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Cube
 */
public class Main {
    
    public static void main(String[] args) {
        String original = "ko";
        
        
        String name = new String(original);
        
        
        
        System.out.println(name);
      
        Phone[]phones = new Phone [8];
        
        phones[0]= new Phone("nokia", 100, 12341);
         phones[1]= new Phone("simens", 50, 1234);
          phones[2]= new Phone("kurocka", 600, 34321);
           phones[3]= new Phone("nkura", 400, 234321);
            phones[4]= new Phone("abra", 3300, 12321);
             phones[5]= new Phone("simens", 200, 1297321);
              phones[6]= new Phone("n123", 300, 234321);
               phones[7]= new Phone("apple", 800, 43217676);
               
               String a = "Kokoko";
               StringBuilder sb = new StringBuilder(a);
               
           //    Stream<String> stream2 = узнать как получить стрим со стринга.
               Stream<Phone> stream = Arrays.stream(phones);
               //1. Отфильтровать и вывести на консоль все телефоны с именами имеющими длину больше 7 символов
               Predicate<Phone> predicate = new Predicate<Phone>(){
                    @Override
                    public boolean test(Phone t) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                   
               };
               
                   //Predicate<Phone> predicate = (phone)->phone.getBrand().length()>5;
               //Consumer<Phone>consumer = (phone)->System.out.println(phone);
               
              Arrays.stream(phones)
                      .filter((o)->o.getBrand().length()>5)
                      .forEach(p->System.out.println(p));
               // Отобразить поток телефонов с ценой меньше 1500 в поток типа Дабл и вывести на консоль
               Arrays.stream(phones)
                       .filter((o)->o.getPrice()<1500)
                       .map((p)->p.getPrice())
                       .forEach(o->System.out.println(o));
               // Найти самій дорогой телефон и вівести его
               
               Comparator<Phone> comparator = (p, p2)-> Double.compare(p.getPrice(), p2.getPrice());
               System.out.println(Arrays.stream(phones)
                       .max((p, p2)-> Double.compare(p.getPrice(), p2.getPrice())).get());
               // Уменьшить цену каждого телефона на 10% и вывести телефоны в конмосоль, цена которых меньше 200
               
               Consumer<Phone>consumer = (p)->p.priceChanhe(10.0);
               
               Arrays.stream(phones)
                       .peek(consumer)
                       .filter((p)->p.getPrice()<100)
                        .forEach(p->System.out.println(p));
                       
                      
               
               
    }
    
}
