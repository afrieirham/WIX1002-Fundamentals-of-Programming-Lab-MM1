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
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isSquare(155));
    }
    
    public static boolean isSquare(int a){
        int i=1;
        while(i*i<=a){
            if(i*i==a)
                return true;
            i++;
        }
        return false;
    }
    
}
