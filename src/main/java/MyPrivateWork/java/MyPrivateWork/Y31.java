package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y31 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1= input.nextInt();
        int sayi2= input.nextInt();
        if (sayi1>0&&sayi2>0){
            System.out.println("Sayilarin Toplami:"+sayi1+sayi2);
        } else if (sayi1<0&&sayi2<0) {
            System.out.println("Sayilarin Carpimi:"+sayi1*sayi2);

        } else if ((sayi1<0&&sayi2>0)||(sayi1>0&&sayi2<0)) {
            System.out.println("Farklı isaretlerle islem yapilamaz");

        } else if (sayi1==0||sayi2==0) {
            System.out.println("0 carpmaya gore yutan elemandir");
        }else
            System.out.println("Gecersiz islem");


    }
}
