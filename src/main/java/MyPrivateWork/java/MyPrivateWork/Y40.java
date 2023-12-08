package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y40 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= input.nextInt();
        switch (sayi){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bu ay 31 ceker");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu ay 30 ceker");break;
            case 2:
                System.out.println("Lutfen yili giriniz");
                int yil= input.nextInt();
                if (yil%4==0){
                    System.out.println("artik yil");
                }else
                    System.out.println("artik yil degil");break;
            default:
                System.out.println("gecerli bir ay numarasi giriniz");
        }

    }
}
