/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JavaApplication7 {
    public static int fact(int n){
        if(n>1){
            return n*fact(n-1);
        }else{
            return 1;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.println(fact(20));
        
    }
    
}
