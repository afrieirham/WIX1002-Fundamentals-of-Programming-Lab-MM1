/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class Game {
    
    private String fullname;
    private int dice, amount;
    private Random g;
    
    public Game(String fullname){
        this.fullname = fullname;
        amount = 0;
        g = new Random();
    }
    
    public int getAmount(){
        return amount;
    }
    
    public String getFullName(){
        return this.fullname;
    }
    
    public void move(){
        dice = g.nextInt(6) + 1;
        amount += dice;
        System.out.println(this.fullname + " rolls " + dice + " Total: " + amount);
    }
    
}
