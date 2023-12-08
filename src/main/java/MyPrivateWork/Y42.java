package MyPrivateWork;

import java.util.Scanner;

public class Y42 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi= input.nextInt();
        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }else System.out.println("sayi tektir");

    }
}
