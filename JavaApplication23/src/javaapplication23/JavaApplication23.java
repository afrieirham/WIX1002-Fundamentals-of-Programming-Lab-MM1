/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        final int MAX=1000, SIZE=10;
        PrintWriter output=new PrintWriter(new FileOutputStream("integer.txt"));
        Random g=new Random();
        for(int i=0; i<SIZE;i++)
            output.print(g.nextInt(MAX)+ " ");
            output.close();
        
    }
    
}
