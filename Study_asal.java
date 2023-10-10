package study_asal;

/**
 *
 * @author gamze
 */
public class Study_asal {

    public static boolean asalMi(int sayi) { // return true / false - boolean
        
        for (int i = 2 ; i < sayi;i++) {
            
            if (sayi % i == 0){
                return false;
            /* burada sayı, 2 den başlayıp diğer sayılara bölünüp bölünmediğini kontrol etmek için for döngüsünü kullandım.
               Bölünüyorsa asal olmadığını belirtmek için de return kullanarak bu döngünün false olduğunu atadık ve döngü böylece biter.,
            */
            }
        }return true; // asalsa true döndürür.
        
        
    }
    public static void main(String[] args) {
        
        
        for (int i = 2 ; i < 1000 ; i++) { // döngüde 2 ile 1000 arasında olması istiyoruz
            
         
            
            if (asalMi(i)){ //asalMi methodundan faydalanarak asal olan i değerlerini bastırıyoruz.
                System.out.println(i);
            }
        }
    }
}
        /*
        
        1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırın.
        
        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayıya asal sayı denir.
         
        */
        

    
    

