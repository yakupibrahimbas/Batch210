package MyPrivateWork.java.Practice.Practice02;

import java.util.Scanner;

public class C06Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1'den 12'ye kadar bir ay numarası giriniz");
        int ay= scan.nextInt();

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiginiz ay 31 gun ceker");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiginiz ay 30 gun ceker");
            case 2:
                System.out.println("Lutfen yil giriniz");
                int yil= scan.nextInt();

                if (yil%4==0){
                    System.out.println("Girdiginiz ay 29 gun ceker");
                }else {
                    System.out.println("Subat ayi 28 gun ceker");
                }
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz.");

        }

    }
}
