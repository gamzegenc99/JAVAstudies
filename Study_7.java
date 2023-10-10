package study_7;

import java.util.Scanner;

/**
 *
 * @author gamze
 */
public class Study_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*
        do {
            // Koşul doğru olduğu sürece
            do while'ın whiledan farkı en az bir kere çalışmasıdır .Önce do çalışır sonra while daki koşula bakar.
        
         }while(koşul);
         /*
        
        
       /* int i = 0;
        
        do {
            System.out.println("i = " + i);
            i++;
            
        }while(i < 5);*/
       
       // 1234
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Bir sayı giriniz:");
        
        int sayi = scanner.nextInt();
        int toplam = 0;
        
        do {
            toplam += sayi % 10; //sayının son basamağı, 10dan kalanı alınarak bulunur
            
            sayi /= 10; //son basamağı atlamak için sayı 10'a bölünüp sayi değişkni güncellenir.
            System.out.println("Sayı: " + sayi);
        }while(sayi > 0);
        
        System.out.println("Rakamları Toplamı = " + toplam);
    }
    
}
