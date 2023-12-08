package MyPrivateWork;

import java.util.Scanner;

public class Y38 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1= input.nextInt();
        int sayi2=input.nextInt();
        System.out.println((sayi1==sayi2)?"sayilar esit":(sayi1>sayi2)?sayi1*sayi1:sayi2*sayi2);

    }
}
