package d6ifswitchternary;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("geçerli bir yaş giriniz");
        } else if (age < 5) {
            System.out.println("bebek");
        } else if (age < 13) {
            System.out.println("çocuk");
        } else if (age <= 20) {
            System.out.println("genç");
        } else if (age < 31) {
            System.out.println("yetişkin");
        } else
            System.out.println("tanımlanmamış yaş");
    }
}

