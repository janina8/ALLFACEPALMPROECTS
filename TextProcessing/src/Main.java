
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

   //     String url = "в лесу родилась елка";
        
   
   
          String site = "www.google.com.lv";
          
   //         System.out.println(site);

        String[] sites = site.split(".");
        
     
        for (String a : sites) {
           System.out.println(a);
        }
        
    }
    
}
 /*      
        
        
        
   //     String[] words = url.split(" ");

     //   for (String a : words) {
//            System.out.println(a);
       // }
        
        
        ArrayList<String> text2 = new ArrayList<>();

  //      for (String b : words) {
    //        text2.add(b);
  //      }
         Collections.reverse(text2);
         
        for(String q:text2){
            System.err.println(q);
        }

       // System.out.println(text2);
    }  */


