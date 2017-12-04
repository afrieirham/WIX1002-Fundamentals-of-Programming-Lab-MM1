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
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        computeCircle(3);
    }
    
    public static void computeCircle(int r){
       double area=Math.PI*r*r;
        double circum=2*Math.PI*r;
        System.out.println("Area: "+area);
        System.out.printf("Circumference: %.2f",circum);
    }
            
    
}
