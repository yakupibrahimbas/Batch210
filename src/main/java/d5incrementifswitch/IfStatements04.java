package d5incrementifswitch;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz.");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Gün sayıları 1'den küçük olamaz");
        } else if (num == 1) {
            System.out.println("Pazar");
        } else if (num == 2) {
            System.out.println("Pazartesi");

        } else if (num == 3) {
            System.out.println("Salı");

        } else if (num == 4) {
            System.out.println("Çarşamba");

        } else if (num == 5) {
            System.out.println("Perşembe");

        } else if (num == 6) {
            System.out.println("Cuma");

        } else if (num == 7) {
            System.out.println("Cumartesi");


        } else {
            System.out.println("Gün sayıları 7'den büyük olamaz");
        }
    }
}
