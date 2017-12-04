/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q4;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int p1,p2;
        
        p1 = (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
        p2 = (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
        
        System.out.println("Score P1: "+p1);
        System.out.println("Score P2: "+p2);
        
        if(p1 > p2){
            System.out.println("P1 win");
        }else if(p1 < p2){
            System.out.println("P2 win");
        }else{
            System.out.println("Draw");
        }
    }
    
}
