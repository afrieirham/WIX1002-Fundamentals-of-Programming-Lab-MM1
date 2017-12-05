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
public class BurgerStall {
    
    private int sold;
    private int eachStallSold[];
    private int ID[];
    
    public BurgerStall(int totalStalls){
        Random rnd = new Random();
        sold  = 0;
        this.eachStallSold =new int [totalStalls];
        this.ID = new int[totalStalls];
        
        for(int x = 0; x < ID.length; x++){
            ID[x] = rnd.nextInt(99999)+1;
        }
        
    }
    
    public void burgerSold(int sold){
        this.sold = this.sold + sold;
    }
    public void soldInOneStall(int i, int sold){
        this.eachStallSold[i] = this.eachStallSold[i] + sold;
    }
    public int getTotalSold(){
        return this.sold;
    }
    public int getTotalSoldEachStall(int i){
        return this.eachStallSold[i];
    }
    public int getID(int i){
        return this.ID[i];
    }
    
}
