package MyPrivateWork;

import java.util.Scanner;

public class Y08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı gir");
        int sayi = input.nextInt();
        if (sayi < 0) {
            System.out.println("nefatif");
        } else if (sayi > 0) {
            System.out.println("pozitif");
        } else
            System.out.println("nötr");
    }
}
