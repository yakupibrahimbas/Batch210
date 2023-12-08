package MyPrivateWork.java.Practice.Practice02;

import java.util.Scanner;

public class C03Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz");
        int sayi=scan.nextInt();

       Object result= sayi%2==0? ("cift sayi"):(sayi+3);
        System.out.println(result);

    }
}
