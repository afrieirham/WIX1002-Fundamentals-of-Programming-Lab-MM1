/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q3;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sales,commission;
        
        System.out.println("Enter sales: ");
        sales = input.nextDouble();
        
        if(sales <= 100){
            commission = (5.0/100)*sales;
            System.out.printf("Commission: %.2f",commission);
        }else if(sales > 100 && sales <= 500){
            commission = (7.5/100)*sales;
            System.out.printf("Commission: %.2f",commission);
        }else if(sales > 500 && sales <= 1000){
            commission = (10.0/100)*sales;
            System.out.printf("Commission: %.2f",commission);
        }else{
            commission = (12.5/100)*sales;
            System.out.printf("Commission: %.2f",commission);
        }
        
    }
    
}
