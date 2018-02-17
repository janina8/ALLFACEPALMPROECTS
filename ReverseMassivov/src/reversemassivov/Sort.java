/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversemassivov;
import java.util.Arrays;
import java. util. Collections;
import java.util.List;
/**
 *
 * @author Cube
 */
public class Sort {
  //  int temp;
    
    public static List<Integer> reverse1(Integer[] intArray) {
     List<Integer> list = Arrays.asList(intArray);
     Collections.sort(list);
     Collections.reverse(list);
     
     return list;
        
        /*  int i = 0;
        int j = intArray.length - 1;
        int tmp;
        while (j > i) {
            tmp = intArray[j];
            intArray[j] = intArray[i];
            intArray[i] = tmp;
            j--;
            i++;
        }
        return intArray; */
    }
}

    /*
    
    public static void main(String[] args) {
        
     int[] array = {1, 4, 3, 8, 5};
    for (int i = 0; i < array.length; i++) {
        for (int k = i + 1; k < array.length; k++) {
            if (array[i] < array[k]) {
                temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
    }
} */