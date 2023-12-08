package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y82 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notlar = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". notu girin: ");
            notlar[i] = scanner.nextDouble();
        }

        double enBuyukNot = notlar[0];
        double enKucukNot = notlar[0];

        for (int i = 1; i < 10; i++) {
            if (notlar[i] > enBuyukNot) {
                enBuyukNot = notlar[i];
            }
            if (notlar[i] < enKucukNot) {
                enKucukNot = notlar[i];
            }
        }

        System.out.println("En büyük not: " + enBuyukNot);
        System.out.println("En küçük not: " + enKucukNot);

        scanner.close();


    }
}