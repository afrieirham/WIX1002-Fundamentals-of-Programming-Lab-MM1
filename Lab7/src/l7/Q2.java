/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;
/**
 *
 * @author pensyarah
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
            try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            FileOutputStream fos = new FileOutputStream("index.htm");
            PrintWriter printer = new PrintWriter(fos);
            
            while(in.hasNextLine()){
                printer.println(in.nextLine());
                //System.out.println(in.nextLine());
            }   
            
            printer.close();

            }
            catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
            }

        
    }
    
}
