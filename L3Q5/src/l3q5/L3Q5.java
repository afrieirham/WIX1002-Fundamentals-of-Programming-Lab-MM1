/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q5;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e,f,x,y,adbc;
        
        System.out.print("Input a: ");
        a = input.nextDouble();
        System.out.print("Input b: ");
        b = input.nextDouble();
        System.out.print("Input c: ");
        c = input.nextDouble();
        System.out.print("Input d: ");
        d = input.nextDouble();
        System.out.print("Input e: ");
        e = input.nextDouble();
        System.out.print("Input f: ");
        f = input.nextDouble();
        
        adbc =(a*d)-(b*c);
        
        if(adbc==0){
            System.out.println("The eq has no solution");
        }else{
            x = ((e*d)-(b*f))/adbc;
            y = ((a*f)-(e*c))/adbc;
            System.out.println("X is "+x);
            System.out.println("Y is "+y);
        }
    }
    
}
