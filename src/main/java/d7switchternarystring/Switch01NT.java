package d7switchternarystring;

import java.util.Scanner;

public class Switch01NT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç ay numarasını giriniz.");
        int aySayisi=input.nextInt();

        switch (aySayisi){
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Şubat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayıs");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Ağustos");
            case 9:
                System.out.println("Eylül");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasım");
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçerli bir ay numarası giriniz.");
        }


    }
}
