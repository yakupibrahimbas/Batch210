package MyPrivateWork;

import java.util.Scanner;

public class Y09 {
    public static void main(String[] args) {
        Scanner gun=new Scanner(System.in);
        System.out.println("Gün sayısını giriniz.");
        int sayi= gun.nextInt();
        if (sayi==0){
            System.out.println("pazar");
        } else if (sayi==1) {
            System.out.println("p.tesi");
        }
        else if (sayi==2) {
            System.out.println("salı");

        }else if (sayi==3) {
            System.out.println("çarşamba");

        }else if (sayi==4) {
            System.out.println("perşembe");

        }else if (sayi==5) {
            System.out.println("cuma");

        }else if (sayi==6) {
            System.out.println("c.tesi");

        }else
            System.out.println("sayı 7 hariç olamaz");












    }
}
