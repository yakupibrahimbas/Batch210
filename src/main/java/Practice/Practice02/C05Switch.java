package Practice.Practice02;

import java.util.Scanner;

public class C05Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0-4 arası sınav puaninizi sisteme giriniz");
        double puan = scan.nextDouble();
        String seviye = "";

        if (puan >= 0 && puan < 1) {
            seviye = "KALDI";
        } else if (puan >= 1 && puan < 2) {
            seviye = "GECTI";
        } else if (puan >= 2 && puan < 2.5) {
            seviye = "IYI";
        } else if (puan >= 2.5 && puan < 3.5) {
            seviye = "UST";
        } else if (puan >= 3.5 && puan <= 4) {
            seviye = "HARIKA";
        } else {
            seviye = "Atanmadi,Sinav puani 0-4 arasi olmali";
        }

        System.out.println("Seviyeniz:" + seviye);
        switch (seviye) {
            case "KALDI":
                System.out.println("F");
            case "GECTI":
                System.out.println("D");
                break;
            case "IYI":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARIKA":
                System.out.println("A");
                break;
            default:
                System.out.println("Atanmadi,Lutfen gecerli bir puan giriniz");
        }


    }
}
