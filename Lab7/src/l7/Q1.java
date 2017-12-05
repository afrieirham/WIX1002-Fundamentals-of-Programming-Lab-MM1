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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] code = {"WXES1116","WXES1115","WXES1110","WXES1112"};
        String[] name = {"Programming 1","Data Structure","Operating System",
            "Computing Math 1"};
        
        Scanner sc =new Scanner(System.in);
        
        try{
            FileOutputStream fStream = new FileOutputStream("course.dat");
            ObjectOutputStream outputStream = new ObjectOutputStream(fStream);
            
            for(int i=0;i<code.length;i++){
                outputStream.writeUTF(code[i]);
                outputStream.writeUTF(name[i]);
            }
            
            outputStream.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
        
        System.out.println("Please enter code:");
        String input_code = sc.next();
        
        try{
            FileInputStream finputstream = new FileInputStream("course.dat");
            ObjectInputStream inputStream = new ObjectInputStream(finputstream);
            
            while(true){
               
                if(input_code.equals(inputStream.readUTF())){
                    System.out.println(inputStream.readUTF());
                    break;
                }
                
            }
            
            inputStream.close();
            
        }catch(EOFException e){
            
        }catch(IOException e){
            System.out.println(e);
        }
        
        
    }
    
}
