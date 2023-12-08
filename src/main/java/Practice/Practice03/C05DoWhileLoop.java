package Practice.Practice03;

import java.util.Scanner;

public class C05DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        do {
            System.out.println("lutfen pozitif bir tamsayi giriniz \nBitirmek icin 0 a basiniz");
            int sayi=scan.nextInt();
            if (sayi==0){
                break;
            } else if (sayi<0) {
                System.out.println("negatif sayi giremezsin");
            }else {
                sayac++;
                toplam+=sayi;
            }
        }while (true);

        System.out.println("girdiginiz" + sayac+ "toplami" +toplam);
    }
}
