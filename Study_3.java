/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study_3;

import java.util.Scanner;

/**
 *
 * @author gamze
 */
public class Study_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("kenar1girin:"  );
        int a = sc.nextInt();
        
        System.out.println("kenar2girin:"  );
        int b = sc.nextInt();
       
        double h = Math.sqrt(a*a+b*b);
        System.out.println("hipotenüs= " + h );
        
        
        // Dik üçgenin hipotenüsünü bulma
    }
    
}
