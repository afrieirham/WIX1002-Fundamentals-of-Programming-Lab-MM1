/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q4;

/**
 *
 * @author pensyarah
 */
public class L6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("The GCD of (24,8) is "+ gcd(24,8));
        System.out.println("The GCD of (10,4) is "+ gcd(10,4));
        
    }
    
    public static int gcd(int p,int q){
       
        while(q!=0){
            int temp=q;
            q=p%q;
            p=temp;
        }
        return p;
        
    }
    
    
}
