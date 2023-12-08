package MyPrivateWork.java.d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz");
        float shortSide = input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");
        float longSide= input.nextFloat();
        System.out.println("Alan:"+(shortSide+longSide));
        System.out.println("çevre:"+(2*shortSide+2*longSide) );
    }
}
