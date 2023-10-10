
package study_8;

import java.util.Scanner;

/**
 *
 * @author gamze
 */
public class Study_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
            -break anahtar kelimesi
         
            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
            
            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.
         
            -continue anahtar kelimesi 
            
            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan 
            işlemlerini yapmadan direkt döngü bloğunun başına döner ve döngü continue işlemi harici çalışmaya devam eder.
        //continue while ile kullanılmasın durumunda sonsuz döngü olabilir bü yüzde arttırma azaltma işlemleriini unutmamalıyız.
            
            
        */

        
            
        /*Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("İşlem sayısı giriniz");

            int islem = scanner.nextInt();
            
            if (islem == -1){ // -1 sayısı girildiğinde döngüden break sayesinde çıkılır.
                System.out.println("Döngüden çıkılıyor....");
                break;
            }
            System.out.println("İşlem :" + islem);
            
        }*/
        
       int i = 0;
        
        while (i < 10) {
            
            if (i == 3 || i == 5) {
               
                i++;// arttırma operatörünü kullanmağımızda i=3 olduğunda durur ve alt blok çalışmaz, sonsuz döngüye girer.
                continue; //koşul sağlandığında bunun altındaki blok çalışmıyor o yüzden 3 ve 5 yazılmadı.
            }
            System.out.println("i = " + i );
            i++;
            
        }
        
                
    }



    }
    
}
