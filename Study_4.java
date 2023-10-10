/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study_4;

import java.util.Scanner;

/**
 *
 * @author gamze
 */
public class Study_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kullanıcıdan alınan 3 sayıdan en büyüğünü bulma
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number one ");
        double num1 = sc.nextDouble();
        System.out.print("enter the number two ");
        double num2 = sc.nextDouble();
        System.out.print("enter the number three ");
        double num3 = sc.nextDouble();
        
        
        
        
        if (num1>= num2 && num1>= num3 ){
            System.out.print("num1 is the max value:" + num1);
            
        }
        else if  (num2>=num1 && num2 >=num3){
            System.out.print("num2 is the max value:" + num2);
            
            
        }
        else { 
            System.out.print("num3 is the max value" + num3);
        }
    }
    
}
