package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y27 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Uzun kenar");
        int uzunKenar= input.nextInt();
        System.out.println("Kisa kenar");
        int kisaKenar= input.nextInt();
        System.out.println("yukseklik");
        int yukseklik=input.nextInt();
        System.out.println(uzunKenar*kisaKenar*yukseklik);
        if (kisaKenar>=uzunKenar){
            System.out.println("hatali değer girdiniz");
        }
    }
}
