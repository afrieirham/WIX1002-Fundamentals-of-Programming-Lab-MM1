/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q1;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int x,y;
        char operand;
        
        System.out.println("Enter the integer");
        x = input.nextInt();
        y = input.nextInt();
        
        System.out.println("Operand? ");
        operand = input.next().charAt(0);
        
        switch(operand){
            case '+': System.out.println(x+" + "+y+" = "+(x+y));
                      break;
            case '-': System.out.println(x+" - "+y+" = "+(x-y));
                      break;
            case '*': System.out.println(x+" * "+y+" = "+(x*y));
                      break;
            case '/': System.out.println(x+" / "+y+" = "+(x/y));
                      break;
            case '%': System.out.println(x+" % "+y+" = "+(x%y));
                      break;
           default: System.out.println("None");
                    break;
        }
        
        
        
        
    }
    
}
