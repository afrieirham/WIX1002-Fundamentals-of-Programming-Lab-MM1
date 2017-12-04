/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;



/**
 *
 * @author pensyarah
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        wrapperChar("abc123");
    }
    public static void wrapperChar(String s){
        int letter=0;
        int digit=0;
        for(int i=0;i<s.length();i++){
            if(isLetter(s.charAt(i)))
                letter++;
            if(isDigit(s.charAt(i)))
                digit++;
        }
        System.out.println("The number of letter(s) is " +letter);
        System.out.println("The number of digit(s) is " +digit);
    }
    
}
