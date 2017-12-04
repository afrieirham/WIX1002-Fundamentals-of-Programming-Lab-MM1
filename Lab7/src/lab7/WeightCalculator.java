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
public class WeightCalculator {
    private int age;
    private double height, weight;
    
    public void input(){
        Scanner k = new Scanner(System.in);
        System.out.println("Age? ");
        age = k.nextInt();
        System.out.println("Height? ");
        height = k.nextDouble();
    }
    
    public void calculateWeight(){
        weight = (height - 100 + age/10)*0.9;
    }
    
    public void output(){
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Recommended weight: " + weight);
    }
}
