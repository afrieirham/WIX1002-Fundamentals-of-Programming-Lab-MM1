/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author pensyarah
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double []result={7,4,5};
     
        double max=0.0;
        int a, b;
        for(int i=0;i<result.length;i++){
           a=result[i];
           b=result[i+1]
            max=getM(a,b);
        }
    }
        public static double getMax(int a, int b, int c){
        if(a>b)
            if(a>c)
                return a;
            else
                return c;
        else
            if(b>c)
                return b;
            else
                return c;
    }
        
        public static double getM(int a, int b){
            if(a>b)
                return a;
            else
                return b;
            
             
        }
        
   
    
    
}
