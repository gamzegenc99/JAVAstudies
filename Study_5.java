package study_5;

import java.util.Scanner;

/**
 *
 * @author gamze
 */
public class Study_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        /*
        switch(op) {
            case durum1: case ler durum belirtiyor 
                islemler
                 break    : case in içinden çıkmayı sağlıyor .
            case durum2:
                islemler
                
                break
                //
                //
            default: belirlediğimiz durumların dışına çıkıyorsa kullanıcı default çalışır
                islemler
                break
        
        }
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("1.işlem");
                break;
            case 2:
                System.out.println("2.işlem");
                break;
            case 3:
                System.out.println("3.işlem");
                 break;
            case 4:
                System.out.println("4.işlem");
                 break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
            
            
            
        }
    }
    
}

    
    
    
