/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author pensyarah
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPentagonal(5));
    }
    
    public static boolean isPentagonal(int num){
        for(int pent=1, i=1;pent<=num; i++){
           pent=i*(3*i-1)/2;
           if(pent==num){
               return true;
           }
        }
        return false;
    }
    
}
