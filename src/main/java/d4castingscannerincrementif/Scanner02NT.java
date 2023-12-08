package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner02NT {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Adınızı ve soyadınızı giriniz");
        String fullName=  input.nextLine();

        System.out.println("YAşınızı giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height=input.nextFloat();

        System.out.println("kilonuzu giriniz");
        short weight=input.nextShort();

        System.out.println("Medeni durumunuzu giriniz");
        String maritalStatus=input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
    }
}
