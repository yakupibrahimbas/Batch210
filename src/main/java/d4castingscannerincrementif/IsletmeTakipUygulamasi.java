package d4castingscannerincrementif;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class IsletmeTakipUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> girisler = new ArrayList<>();
        ArrayList<String> cikislar = new ArrayList<>();
        Date tarih = new Date();

        while (true) {
            System.out.println("1. Giriş Ekle");
            System.out.println("2. Çıkış Ekle");
            System.out.println("3. Girdileri Listele");
            System.out.println("4. Çıkışları Listele");
            System.out.println("5. Çıkış");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Giriş açıklamasını girin: ");
                    String giris = scanner.next();
                    girisler.add(tarih + " - " + giris);
                    System.out.println("Giriş kaydedildi.");
                    break;
                case 2:
                    System.out.print("Çıkış açıklamasını girin: ");
                    String cikis = scanner.next();
                    cikislar.add(tarih + " - " + cikis);
                    System.out.println("Çıkış kaydedildi.");
                    break;
                case 3:
                    System.out.println("Girdiler:");
                    for (String g : girisler) {
                        System.out.println(g);
                    }
                    break;
                case 4:
                    System.out.println("Çıkışlar:");
                    for (String c : cikislar) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.out.println("Çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçenek.");
                    break;
            }
        }
    }
}
