/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author pensyarah
 */
public class BankAccount {
    
    private String fullName, icNumber;
    private double amount;
    
    public BankAccount(String f, String i, double a){
        fullName = f;
        icNumber = i;
        amount = a;
    }
    
    public void deposit(double a){
        amount += a;
        System.out.println("You deposit " + a + "successfully");
    }
    
    public void withdraw(double a){
        if(a > amount){
            System.out.println("Miskin");
        }
        else{
            amount -= a;
            System.out.println("Withdrawn " + a + "successfully");
        }   
    }
    
    public void output(){
        System.out.println("Your current balance is " + amount);
    }
}
