/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int line_count=0,word_count=0,char_count=0;
        
        try{
            FileInputStream inputStream = new FileInputStream("normal.txt");
            Scanner input = new Scanner(inputStream);
            
            while(input.hasNextLine()){
                String line = input.nextLine();
                line_count++;
                char_count = char_count + line.length();
                
               for(int i=0;i<line.length();i++){
                   
                   if(line.charAt(i)==' '){
                       word_count++;
                   }
               }
               // Making it persistent to number of words.
               word_count++;
            }
            input.close();
            
            System.out.println("Lines: "+line_count);
            System.out.println("Words: "+word_count);
            System.out.println("Characters: "+char_count);
            
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
