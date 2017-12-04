/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author pensyarah
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(combination(5,2));
    }
    
    public static double combination(int n, int k){
        int nfact=1, kfact=1, nkfact=1;
        for(int i=2;i<=n;i++)
            nfact*=i;
        for(int i=2;i<=k;i++)
            kfact*=i;
        for(int i=2;i<=n-k;i++)
            nkfact*=i;
        
        return nfact/(double)(kfact*nkfact);
    }
    
}
