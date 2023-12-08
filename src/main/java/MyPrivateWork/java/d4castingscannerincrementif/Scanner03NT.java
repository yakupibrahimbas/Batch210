package MyPrivateWork.java.d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner03NT {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");

        double firstNumber=input.nextDouble();
        double secondNumber=input.nextDouble();
        System.out.println("Toplam:" +(firstNumber+secondNumber));
        System.out.println("Çıkarma:" +(firstNumber-secondNumber));
        System.out.println("çarpma:" +(firstNumber*secondNumber));
        System.out.println("bölme:" +(firstNumber/secondNumber));

    }
}
