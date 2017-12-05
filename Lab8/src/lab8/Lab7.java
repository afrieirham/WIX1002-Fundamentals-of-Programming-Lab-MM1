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
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Burger a = new Burger("ABC1");
        Burger b = new Burger("ABC2");
        
        a.sold(10);
        b.sold(10);
        
        a.display();
        a.displayAll();
       
        
    
}
}
