/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author pensyarah
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int number = addNumber(12,5);
       int smallnumber = minusNumber(100,10);
       String lastName = displayName("John");
               
       System.out.println(number);
       System.out.println(smallnumber); 
       System.out.println(lastName);
       sayHello();
    }
    
    public static int addNumber(int a, int b){
        return a + b;
    }
    
    public static int minusNumber(int a, int b){
        return a - b;
    }
    
    public static void sayHello(){
        System.out.println("Hello there!");
    }
    
    public static String displayName(String name){
        String lastName = name;
        return lastName;
    }
    
    public static void multiPrint(int n, char c){
        for(int i = 1; i <= n; i++){
            System.out.print(c);
        }
    }
    
}
