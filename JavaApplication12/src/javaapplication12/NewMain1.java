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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sales,commission=0;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the sales volume: ");
        sales=k.nextDouble();
        if(sales<=100)
            commission=0.05*sales;
        else if(sales>100 && sales<=500)
            commission=0.075*sales;
        else if(sales>500 && sales<=1000)
            commission=0.1*sales;
        else if(sales>1000)
            commission=0.125*sales;
        else
            System.out.println("Invalid sales volume");
        
        System.out.println("Total commission is "+commission+" for "+sales+" volume");
    }
    
}
