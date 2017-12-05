    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q6;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double x,y,r,distance;
        
        System.out.println("Enter x y:");
        x = input.nextDouble();
        y = input.nextDouble();
        
        System.out.println("Enter radius");
        r = input.nextDouble();
        
        // Since point of origin is (0,0) = Center of circle
        distance = Math.sqrt((x*x)+(y*y));
        
        System.out.println(distance);
        if(distance<r){
            System.out.println("Inside circle");
        }else{
            System.out.println("Outside cirlce");
        }
        
    }
    
}
