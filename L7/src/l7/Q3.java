/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            FileInputStream inputStream = new FileInputStream("normal.txt");
            Scanner input = new Scanner(inputStream);
            
            FileOutputStream fos = new FileOutputStream("reverse.txt");
            PrintWriter printer = new PrintWriter(fos);
            
            while(input.hasNextLine()){
                
                String line = input.nextLine();
                String reversed = "";
                
                for(int i=line.length()-1 ; i>=0 ; i--){
                    
                    reversed = reversed + line.charAt(i);
                   
                }
                 printer.println(reversed);
                 System.out.println(reversed);
            }
            
            
            input.close();
            printer.close();
            
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
