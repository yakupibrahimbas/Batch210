package MyPrivateWork;

import java.util.Scanner;

public class Y45 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }else System.out.println("sayi tektir");
    }
}
