package MyPrivateWork.java.OzelDers;

import java.util.Scanner;

public class OD01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int sayi=scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Sayıların toplamı:"+(sayi+sayi2));
        System.out.println("sayıların farkı:"+(sayi-sayi2));



    }
}
