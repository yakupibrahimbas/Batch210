package MyPrivateWork.java.Practice.Practice02;

import java.util.Scanner;

public class C07Manipulations {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Ad-soyad giriniz");
        String adSoyad= scan.nextLine().trim();
        int spaceIdx=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,spaceIdx);
        String soyad=adSoyad.substring(spaceIdx+1);
       String ad2= ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1);
        System.out.println("Ad:"+ad2+"\nSoyad:"+soyad);


    }
}
