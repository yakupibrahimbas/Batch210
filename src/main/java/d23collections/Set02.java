package d23collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        //interview sorusu
//ornek 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz
        //Mail'ler unique(benzersiz). O yuzden set kullanacagiz, natural order dedigi icin de TreeSet kullanacagiz

        //1.yol - yavas - her elemanda siralama yapar

        long t1=System.nanoTime();


        TreeSet<String>emails=new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        emails.add("d@gmail.com");
        emails.add("e@gmail.com");
        emails.add("f@gmail.com");
        emails.add("j@gmail.com");
        emails.add("l@gmail.com");
        emails.add("m@gmail.com");
        System.out.println(emails);
        
        
//TreeSet'ler cok yavas, biraz hizlandirabilir miyiz?
// elemanlari eklerken en hizli olandan (HashSet) yardim alalim

//2.yol - Tavsiye edilir - daha hizli

        HashSet<String>emailsHs=new HashSet<>();

        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("d@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("f@gmail.com");
        emailsHs.add("j@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("m@gmail.com");
        System.out.println(emailsHs);

        long t2=System.nanoTime();


        TreeSet<String> emailHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailHsTs);

        long t3=System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);


    }

}
