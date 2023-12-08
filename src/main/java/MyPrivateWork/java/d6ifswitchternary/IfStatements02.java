package MyPrivateWork.java.d6ifswitchternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Gün ismi giriniz.");
        String gunIsmi=input.next();
        if (gunIsmi.equalsIgnoreCase("Cumartesi")||gunIsmi.equals("Pazar")){
            System.out.println("haftasonu");
        } else if (gunIsmi.equals("Pazartesi")||gunIsmi.equals("Salı")||gunIsmi.equals("çarşamba")
        ||gunIsmi.equalsIgnoreCase("perşembe")||gunIsmi.equals("cuma")){
            System.out.println("haftaiçi");
        }else {
            System.out.println("geçerli bir gün ismi giriniz");
        }
    }
}
