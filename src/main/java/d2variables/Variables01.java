package d2variables;

import java.util.SortedMap;

public class Variables01 {
    public static void main(String[] args) {
        //Java bu satırı okumaz.Kendimize veya başkasına açıklamadır.
        /*
        Java Strongly type'dır. Bu nedenle javadaki her değişken (variable belirli veri türü(data type) ile ilişkilendirilecektir)
         */
        //sıralama nasıl olacaktı?
        //Data Type ==>Variable Name==>Atama Operatörü==>Data==>Noktalı virgül
        //Ornek1:Dtring data tipinde ismi selam olan bir variable oluşturarak,
        //içine"Hello World" yükleyiniz.
        String              selam                 =                 "Hello World"  ;
        System.out.println(selam);
        //---------------------
System.out.println("---------------------");
        //ornek2: Tamsayi(int) data tipinde ismi age olan bir varaible oluşturunuz ve içine 15 yükleyip
        //console'a yazdırınız.

        int age = 15;

        System.out.println(age);

        System.out.println("---------------------");
/*
Not1: primitive data type'lerini Java oluşturmuştur.
Not2: primitive data type'larinin isimlerinde sadece küçük harf kullanılır
Not3: primitive data type'larınıa göre memory'de farklı farklı yer kaplarlar.
 */
        //----------------------
        //1-byte data type
        //tamsayılar içindir. Hafızada 1 byte (8bit) yer kaplar
        //-128 den +127 e (dahil) tamsayı değerleri için kullanılır.

        // Ornek 1:byte data tipinde öğrenci yasi için bir variable oluşturun ve deger atayin.
        byte ogrenciYasi =32;
        System.out.println(ogrenciYasi);
        System.out.println("---------------------");

        //---------------------------------
    //2- short data type
    //Tamsayılar içindir. Hafızada 2 byte yer kaplar.
    //-32768 dan +32767 e (dahil) tamsayi değerleri için kullanılır

    //ornek: Site nüfusu için bir variable oluşturun ve değer atayın.
    short siteNufusu= 215;
        System.out.println(siteNufusu);

        System.out.println("---------------------");

//------------------------------------------
//3-inr data type
//Tamsayılar içindir. Hafızada 4 byte yer kaplar
//-2,147,483648 ile 2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir.
        //label kullandığımızda console'a yazdırırırken , yazdırılan veri hakkında aciklama gorulur

int ulkeNufusu =85000000;
        System.out.println("ulke Nufusu : = " + ulkeNufusu);
        System.out.println("---------------------");

        //ornek 2: Ikı tane int variable oluşturun ve toplamlarını bir etiketle console'a yazdirin.

        int a=12, b=13, c=154;
        System.out.println("Toplam : "+(a+b+c));
        System.out.println("---------------------");

        System.out.println("ulkeNufusu = " + ulkeNufusu);
    }
}
