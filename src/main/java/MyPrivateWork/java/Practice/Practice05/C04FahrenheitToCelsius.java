package MyPrivateWork.java.Practice.Practice05;

import java.util.Scanner;

public class C04FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen fahrenheit cinsinden sicaklik degerini giriniz");
        double fahrenhite=scan.nextDouble();
        fahrToCels(fahrenhite);
        double celsius=fahrToCels(fahrenhite);
        System.out.println(celsius);

    }

    private static double fahrToCels(double fahrenhite) {
        double celsius=(fahrenhite-32)/1.8;

        return celsius;





    }
}
