/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversemassivov;

import java.util.Arrays;
import java. util. Collections;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;


/**
 *
 * @author Cube
 */
public class ReverseMassivov {

  //
public Sort sort;
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    
        
        String site = "www.google.com.lv/koko=21 ko";
        
        System.out.println(site);
        
     
       String[] sites  = new String[10];
        sites = site.split("\\.");
     
        
         Arrays.sort(sites);
     
        for (String a : sites) {
           System.out.println(a);
        }
        
        
        
        System.out.println(Arrays.toString(sites));
        
        Integer[] intArray = {1, 4, 3, 8, 5};
        
      //  Arrays.sort(intArray);
       // Arrays.sort(intArray);
       ArrayUtils.reverse(intArray);
       
       
      Sort.reverse1(intArray);
      Arrays.parallelSort(intArray);
     
       System.out.println(Arrays.toString(intArray));
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ReverseMassivov other = (ReverseMassivov) obj;
        if (!Objects.equals(this.sort, other.sort)) {
            return false;
        }
        return true;
    }
}
    
    
  

