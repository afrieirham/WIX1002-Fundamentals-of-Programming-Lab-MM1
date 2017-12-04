/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int num1, num2,answer=0;
        char operand;
        String input,input2;
        Scanner k=new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        num1=k.nextInt();
        System.out.print("Enter integer 2: ");
        num2=k.nextInt();
        input2=k.nextLine();
        System.out.print("Enter the operand: ");
        input=k.nextLine();
        operand=input.charAt(0);
        System.out.println(operand);
        if(operand=='+')
            answer=num1+num2;
        else if(operand=='-')
            answer=num1-num2;
        else if(operand=='/')
            answer=num1/num2;
        else if(operand=='*')
            answer=num1*num2;
        else if(operand=='%')
            answer=num1%num2;
        
        System.out.println("Answer is: "+answer);
        
    }
    
}
