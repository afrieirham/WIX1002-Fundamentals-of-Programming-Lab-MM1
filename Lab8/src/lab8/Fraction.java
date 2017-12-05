/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Scanner;
/**
 *
 * @author pensyarah
 */
public class Fraction {
    private int numerator, denominator;
    
    public void setNumerator(int n){
        numerator = n;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public void setDenominator(int d){
        denominator = d;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public void input(){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        setNumerator(k.nextInt());
        System.out.println("Enter denominator: ");
        setDenominator(k.nextInt());
    }
    
    public void output(){
        //int a = gcd();
       // System.out.println("The fraction is: " + getNumerator()/a + "/" + getDenominator()/a);
    }
}
