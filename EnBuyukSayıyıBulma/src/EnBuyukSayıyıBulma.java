
import java.util.Scanner;


public class EnBuyukSayıyıBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayı :");
        int a = scanner.nextInt();
        System.out.print("ikinci sayı :");
        int b = scanner.nextInt();
        System.out.print("ücüncü sayı :");
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
      System.out.println("Maksimum sayı :" + maks );

    }
}

