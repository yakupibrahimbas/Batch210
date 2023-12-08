package MyPrivateWork;

import java.util.Scanner;

public class Y15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int aySayisi= input.nextInt();
        switch (aySayisi){
    case 1:
        System.out.println("ocak");
    case 2:
        System.out.println("Şubat");
    case 3:
        System.out.println("Mart");
    case 4:
        System.out.println("Nisan");
    case 5:
        System.out.println("Mayıs");
    case 6:
        System.out.println("Haziran");
    case 7:
        System.out.println("Temmuz");
    case 8:
        System.out.println("ağustos");
    case 9:
        System.out.println("Eylül");
    case 10:
        System.out.println("Ekim");
    case 11:
        System.out.println("Kasım");
    case 12:
        System.out.println("Aralık");
        break;
    default:
        System.out.println("geçerli ay gir");
}
    }
}
