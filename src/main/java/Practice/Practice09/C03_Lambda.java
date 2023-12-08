package Practice.Practice09;

import d30lambda.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C03_Lambda {
    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("erik", "portakal", "uzum", "cilek", "greyfurt", "nar",
                "mandalina", "armut", "elma", "keciboynuzu", "elma"));
        ilkHarfEveyaCYazdir(meyve);
        System.out.println();
        yildizlariYazdir(meyve);
        System.out.println(chBuyKucSiralaIlkUcListele(meyve));
        System.out.println("*******");
        System.out.println(ilkiBuyukIkinciHarfeGoreListele(meyve));
        System.out.println(eIcerenUzunveSonHarfeGoreSirala(meyve));
        System.out.println(Arrays.toString(lLeriSilArray(meyve)));



    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım

    public static void ilkHarfEveyaCYazdir(List<String> l) {
        l.stream().filter(t -> t.toLowerCase().startsWith("e") || t.toLowerCase().startsWith("c")).forEach(Utils::yazdir);
    }
    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void yildizlariYazdir(List<String> l) {
        l.stream().map(t -> "*" + t + "*").forEach(Utils::yazdir);
    }

    public static List<String> chBuyKucSiralaIlkUcListele(List<String> l) {
        return
                l.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).collect(Collectors.toList());
    }

    //SORU4: list elemanlarının benzersiz olanlarini ilk harf buyuk gerisi
    // kucuk sekılde 2. harfe gore sıralayıp List halinde return ederek yazdırınız
    public static List<String> ilkiBuyukIkinciHarfeGoreListele(List<String> l) {
        l.stream().map(t -> t.toUpperCase().charAt(0) + t.toLowerCase().substring(1)).distinct().sorted(Comparator.
                comparing(t -> t.charAt(1))).collect(Collectors.toList());
        return l;
    }

    //SORU5 : List elemanlarının icinde e olanlarını uzunluklarina ve son harflerine gore sıralayıp List halinde return ederek yazdırınız
    public static List<String> eIcerenUzunveSonHarfeGoreSirala(List<String> l) {
        l.stream().filter(t -> t.contains("e")).sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(t.length() - 1))).collect(Collectors.toList());
        return l;
    }
    //SORU6 : List elemanlarının icindeki tum 'l' harflerini siliniz Array halinde return ederek yazdırınız
    public static String[]lLeriSilArray(List<String>l){
        l.stream().map(t->t.replace("l","")).toArray();

        return l.toArray(new String[0]);
    }

}
