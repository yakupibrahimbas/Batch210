package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 6 basamaklı bir sayı giriniz.");
        int num=input.nextInt();
        int ilkIki=num/10000;
        int sonIki=num%1000;
        System.out.println(ilkIki+sonIki);


    }
}
