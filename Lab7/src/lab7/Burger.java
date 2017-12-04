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
public class Burger {
    
    private String ID;
    private int burgerSold;
    private static int totalBurgerSold = 0;
    
    public Burger(String id){
        burgerSold = 0;
        this.ID = id;
    }
    
    public void sold(int burger){
        burgerSold += burger;
        totalBurgerSold += burger;
    }
    
    public void display(){
        System.out.println("Burger Stall: " + ID);
        System.out.println("Total burger sold today for my stall: " + burgerSold);
    }
    
    public void displayAll(){
        System.out.println("Total burger sold today for all stalls: " + totalBurgerSold);
    }
    
}
