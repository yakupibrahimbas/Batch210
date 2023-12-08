package MyPrivateWork.java.MyPrivateWork;

import java.util.Scanner;

public class Y43 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();
        boolean haftaIciMi=gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma");
        boolean haftaSonuMu=gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar");
        if (haftaIciMi){
            System.out.println("hafta ici");
        }

        if (haftaSonuMu){
            System.out.println("hafta sonu");
        }
        if (!(haftaIciMi||haftaSonuMu)){
            System.out.println("yanlis ya da eksik bir gun ismi girdiniz");
        }


    }
}