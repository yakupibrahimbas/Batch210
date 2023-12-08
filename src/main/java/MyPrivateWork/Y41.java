package MyPrivateWork;

import java.util.Scanner;

public class Y41 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String adSoyad= scan.nextLine().trim();
        int spaceIdx=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,spaceIdx);
        String soyad=adSoyad.substring(spaceIdx+1);
        String ad2=ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1);
        String soyad2=soyad.toUpperCase().charAt(0)+soyad.toLowerCase().substring(1);
        System.out.println("Ad:"+ad2+"\nSoyad:"+soyad2);
    }
}
