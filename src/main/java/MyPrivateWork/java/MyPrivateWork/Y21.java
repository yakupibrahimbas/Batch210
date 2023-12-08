package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz: ");
        String gender = input.next(); //next() methodu tek kelime alır

        System.out.println("Lütfen yaşınızı giriniz: ");
        int age = input.nextInt();

        if (age < 0){
            System.out.println("Lütfen 0'dan küçük bir sayı girmeyiniz!");
        } else if (gender.equalsIgnoreCase("Kadın")) {
            if (age < 18){
                System.out.println("Çalışamaz!");
            }else if (age < 60){
                System.out.println("Çalışmalı");
            }else{
                System.out.println("Emekli olabilir");
            }
        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age < 16){
                System.out.println("Çalışamaz!");
            }else if (age < 65 ){
                System.out.println("Çalışabilir");
            }else{
                System.out.println("Emekli olabilir");
            }
        }else{
            System.out.println("Sizin için farklı bir tanımlama yapılmadı");
        }


    }
}