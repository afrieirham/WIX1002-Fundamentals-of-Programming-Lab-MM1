/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q2;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class L5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] number = new int[10];
        
        Random rand = new Random();
        

       for(int i=0;i<number.length;i++){
           number[i]=rand.nextInt(21);
           
           for(int j=0;j<i;j++){
               if(number[i]==number[j]){
                   i--;
                   break;
               }
           }
           
      
           
       }
       
       
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
       }
        
    }
    
}
