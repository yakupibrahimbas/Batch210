package MyPrivateWork;

import java.util.Scanner;

public class Y07 {
    public static void main(String[] args) {
        if (3 < 5) {
            System.out.println("if çalıştı");
            if (7 == 4 + 3) {
                System.out.println("if tekrar çalıştı lo");
            }
            int sayi = 17;
            if (sayi > -1 && sayi < 10)
            System.out.println("this is a rakam");
        }
        int num = 5;

        if (num > -1 && num < 10) {
            System.out.println("Rakam");
        }
        int no=750;
        if (no>=100&&no<1000) {
            System.out.println("sayı 3 basamaklıdır.");
        }

Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");
        int numb= input.nextInt();
        if (numb%2==0){
            System.out.println("Sayı çifttir");

        }else
            System.out.println("sayı tektir");


    }
}
