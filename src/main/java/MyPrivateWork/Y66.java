package MyPrivateWork;

import java.util.Random;
import java.util.Scanner;

public class Y66 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int rastgeleSayi=random.nextInt(101);
        int denemeSayisi=0;
        int tahminEdilen;
        boolean tahminDogrumu=false;
        System.out.println("0-100 arasi sayi tahmin etmeye calisin");
        do {
            System.out.println("tahmininizi yapin");
            tahminEdilen = scanner.nextInt();
            denemeSayisi++;
            if (tahminEdilen < rastgeleSayi) {
                System.out.println("sayi daha buyuk");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("sayi daha kucuk");

            } else {
                tahminDogrumu = true;
                System.out.println("tebrikler dogru tahmin");
                System.out.println("Deneme Sayisi: = " + denemeSayisi);
                ;
            }
        }while (!tahminDogrumu);



            }
        }













