package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y13 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Gün ismi giriniz");
        String gunIsmi=input.next();

        boolean haftaSonu=gunIsmi.equalsIgnoreCase("Cumartesi")||
                gunIsmi.equalsIgnoreCase("Pazar");
        boolean haftaIci=gunIsmi.equalsIgnoreCase("Pazartesi")||
                gunIsmi.equalsIgnoreCase("Salı")||
                gunIsmi.equalsIgnoreCase("Çarşamba")||
                gunIsmi.equalsIgnoreCase("Perşembe")||
                gunIsmi.equalsIgnoreCase("Cuma");
        if (haftaIci){
            System.out.println("hafta içi");
        } else if (haftaSonu) {
            System.out.println("haftasonu");
        }else
            System.out.println("lütfen düzgün bir gün giriniz");
    }
}
