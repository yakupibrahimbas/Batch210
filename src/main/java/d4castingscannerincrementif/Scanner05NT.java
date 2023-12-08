package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner05NT {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz.");
        int num=input.nextInt();

        int ilkIki =num/1000;
        int sonIki =num%100;
        System.out.println(ilkIki+sonIki);


    }
}
