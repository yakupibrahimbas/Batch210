package MyPrivateWork.java.Practice.Practice02;

import java.util.Scanner;

public class C01IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int sayi1=scan.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayi2=scan.nextInt();

        if (sayi1>0&&sayi2>0);{
            System.out.println(sayi1+sayi2);
        }
         if (sayi1<0&&sayi2<0) {
            System.out.println( +(sayi1*sayi2));
        } else if ((sayi1>0&&sayi2<0)||(sayi1<0&&sayi2>0)) {
            System.out.println("Farklı işaretlerde sayilarla islem yapamazsin");
        } else if (sayi1==0||sayi2==0) {
            System.out.println("Sifir carpmaya gore yutan elemandir.");
        }

    }
}
