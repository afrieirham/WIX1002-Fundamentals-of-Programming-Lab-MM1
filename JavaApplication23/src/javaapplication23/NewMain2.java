/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(new FileInputStream("integer.txt"));
        int [] k = new int[10];
        int max = 0;
        for(int i = 0 ;i < 10 ; i++ ){
            k[i] = input.nextInt();
            System.out.println(k[i]);
            
            // find largest
            if (k[i] > max)
                max = k[i];
        }                    
        input.close();
            // display largest
            System.out.println("The largest integer is " + max);

        }
    }
    

