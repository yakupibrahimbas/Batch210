package Practice.Practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C01_Lambda {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        pozCiftElYazdir(list);
        System.out.println();
        pozCiftElYazdirRef(list);
        System.out.println();
        kareYazdir(list);
        kareleriTekrarsizYazdir(list);
        buyKucSiralaYazdir(list);
        pozKuplerinBirbs5OlanlariYazdir(list);


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    //Lambda Expression kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın

    public static void pozCiftElYazdir(List<Integer>l){

        l.stream()//listi stream'e donusturerek akısa sunduk
                .filter(t->t%2==0 && t>0)//akistan gelen pozitif ve cift elemanlari filtreledik.sarti saglamayanlar elendi.
                .forEach(t-> System.out.print(t+" "));//aralarinda bir bolsuklu ayni satirda yazdir


    }


    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın

    public static void pozCiftElYazdirRef(List<Integer>k){
        k.stream().
                filter(Utils::pozitifMi)
                .filter(Utils::ciftMi)
                .forEach(Utils::yazdir);
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kareYazdir(List<Integer>k){
        k.stream().map(t->t*t).forEach(Utils::yazdir);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareleriTekrarsizYazdir(List<Integer>l){
        l.stream().map(t->t*t).distinct().forEach(Utils::yazdir);
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSiralaYazdir(List<Integer>s){
        s.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozKuplerinBirbs5OlanlariYazdir(List<Integer>l){
        l.stream().filter(Utils::pozitifMi).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }
    }

