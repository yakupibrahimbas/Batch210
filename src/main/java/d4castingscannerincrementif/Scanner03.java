
                package d4castingscannerincrementif;

import java.util.Locale;
import java.util.Scanner;

        public class Scanner03 {
            public static void main(String[] args) {
                //Ornek3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin
                // sonuclarini ekrana yazdiran kodu yaziniz.

                //Scanner input = new Scanner(System.in).useLocale(Locale.US); //useLocale(Locale.US); yazarsaniz ondalik
                //sayilarda nokta kullanabilirsiniz
                Scanner input = new Scanner(System.in);

                System.out.println("lutfen iki sayi giriniz");

                double firstNumber = input.nextDouble();
                double secondNumber = input.nextDouble();

                System.out.println("Toplam : " + (firstNumber + secondNumber));
                System.out.println("Fark : " + (firstNumber - secondNumber));
                System.out.println("Carpim : " + (firstNumber * secondNumber));
                System.out.println("Bolum : " + (firstNumber / secondNumber));
            }
        }


