
import java.util.Scanner;


public class EnBuyukSayiyiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayi :");
        int a = scanner.nextInt();
        System.out.print("ikinci sayi :");
        int b = scanner.nextInt();
        System.out.print("ücüncü sayi :");
        int c = scanner.nextInt();
        
        int maks = -1 ;
        if ( a >= b && a >= c) {
            maks = a;
    }        
        else if  (b >= a && b >= c) {
            maks = b;
    }    
        else {  
        
            maks = c;
    }
      System.out.println("Maksimum sayi :" + maks );

    }
}

