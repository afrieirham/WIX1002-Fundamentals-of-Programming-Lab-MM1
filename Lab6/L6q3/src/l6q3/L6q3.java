/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q3;
import java.util.*;

/**
 *
 * @author pensyarah
 */
public class L6q3 {
    public static void main(String[] args) {
        int[] arr = {1234, 212, 321, 214, 12312, 1231, 123, 123, 132, 213138974};
        System.out.println(Arrays.toString(rvrs(arr)));
    }
    public static int[] rvrs(int[] arr){
        int[] arr2 = new int[10];
        for(int i=0; i<arr.length; i++){
            String temp = Integer.toString(arr[i]);
            char[] chr = temp.toCharArray();
            for(int j=0; j<chr.length/2; j++){
                char tempchr = chr[j];
                chr[j] = chr[chr.length-1-j];
                chr[chr.length-1-j] = tempchr;
            }
            StringBuilder rslt = new StringBuilder();
            for(int j=0; j<chr.length; j++) rslt.append(chr[j]);
            String result = rslt.toString();
            arr2[i] = Integer.parseInt(result);
        }
        return arr2; 
    }
    
    
  
}
