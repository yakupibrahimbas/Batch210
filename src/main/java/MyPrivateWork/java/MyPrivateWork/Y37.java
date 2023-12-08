package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("cinsiyet giriniz");
        String gender= input.next();
        System.out.println("yasinizi giriniz");
        int yas= input.nextInt();
        if (yas<0){
            System.out.println("gecerli bir yas giriniz");
        } else if (gender.equalsIgnoreCase("Kadın")) {

        }if (yas<18) {
            System.out.println("calisamaz");
        } else if (yas<60) {
            System.out.println("calismali");
        } else if (yas>60) {
            System.out.println("emekli olabilir");
        }
        else {
            System.out.println("gecersiz");

        } if (gender.equalsIgnoreCase("erkek")) {

        } else if (yas<17) {
            System.out.println("calismamali");
        } else if (yas<65) {
            System.out.println("calismali");
        } else if (yas>65) {
            System.out.println("emekli olabilir");
        }else
            System.out.println("gecerli bir ifade giriniz");


    }
}
