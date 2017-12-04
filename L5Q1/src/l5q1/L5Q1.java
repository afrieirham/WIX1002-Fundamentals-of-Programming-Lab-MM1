/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] score;
        int N=0,min=0,max=0,sum=0;
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Enter N students");
        N = sc.nextInt();
        
        score = new int[N];
        
        for(int i = 0;i<N;i++){
            score[i]=rand.nextInt(101);
            sum=sum+score[i];
            
            if(i==0){
                min = score[i];
                max = score[i];
            }
            
            if(score[i]>max)
                max=score[i];
            if(score[i]<min)
                min=score[i];
        }
        
        System.out.println("The score is: ");
        for(int i = 0;i<N;i++){
            System.out.println(score[i]);
        }
        System.out.printf("The min: %d",min);
        System.out.printf("\nThe max: %d",max);
        System.out.printf("\nThe avg: %.2f",(float)sum/N);
    }
    
}
