package d5incrementifswitch;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = input.nextInt();

        if (num>0){
            System.out.println(num+" sıfırdan büyüktür");

        } else if (num<0) {
            System.out.println(num+" sıfırdan küçüktür");
        }else{
            System.out.println(num+" noturdur");
    }


    }
}
