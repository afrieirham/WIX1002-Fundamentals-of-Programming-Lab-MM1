/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        int MAX=1000, SIZE=10;
        Random input=new Random();
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("interger.dat"))) {
            for (int i=0;i<SIZE;i++)
                output.writeInt(input.nextInt(MAX));
        }
    }
    
}
