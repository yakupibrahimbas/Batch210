package Practice.Practice01;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karesini almak istediğiniz sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Girdiğiniz sayı"+sayi1);
        System.out.println("Girdiğiniz sayının karesi:"+sayi1*sayi1);

    }
}
