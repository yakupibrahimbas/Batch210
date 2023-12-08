package d3datatypesconcatenationscanner;

import java.sql.SQLOutput;

public class Variables01 {
    public static void main(String[] args) {
        //psvm yada main ile kısa yoldan main method oluşturabilirsiniz.
        //4-long data type:
        //Tam sayılar içindir. Hafızada 8 byte yer kaplar
        //long oluştururken eğer değer int'in maksimum değerinden büyük ise
        //sonuna "L" koymak zorundasınız,yoksa hata alırsınız.
        //Örnek1: İnsan vücudundaki hücre sayısı için variable oluşturup değer ataması yapınız ve
        //console'a yazdırınız.
        System.out.println("---------------------");

        long hucreSayisi =123456789012L ;
        System.out.println(hucreSayisi);

        System.out.println("---------------------");

        long c=12, d=13;
        System.out.println("Toplam:"+(c+d));

        System.out.println("---------------------");
//5-float data type: hafızada 4byte yer kaplar.
//Decimal-ondalıklı sayılar için kullanılır.
//Özellikle fiyat değerleri için kullanılır.

//Not:Java ondalıklı sayıları otomatik olarak double kabul eder.
//float olmasında ısrar ediyorsanız sonuna "F veya f" koyabiliriz.
//Örnek1:2 tane float data tipinde variable oluşturunuz ve bunların toplamını bir etiket ile
//console'a yazdırınız.

float corapFiyati =12.99F;
float gomlekFiyati=25.99F;
System.out.println("Toplam Fiyat:"+(corapFiyati+gomlekFiyati));

        System.out.println("---------------------");
float corapFiyati2 = 32.99F ,gomlekFiyati2= 53.99F;
        System.out.println("Fiyat:"+corapFiyati2+gomlekFiyati2);

        System.out.println("---------------------");
//6-double data type:
//double memory'de 8 byte yer kaplar. Daha hassas hesaplamalarda kullanılır.
//örnek 1: Hucre agirligi icin bir variable olusturup console'a yaqziniz.

        double hucreAgirligi = 0.000000000000028;
        System.out.println(hucreAgirligi);

        System.out.println("---------------------");


        //7-char data type:
        //Tek karakterler için kullanılır. 2 byte2tir.Sayi ,sembol,harf farketmez
        //tek tirnak icine yazilir.

        char isminIlkHarfi = 'S' ;
        System.out.println(isminIlkHarfi);

        System.out.println("---------------------");
//8-Boolean Data Type:
//Sadece true ve false olmak üzere 2 farklı değer alır
// Örnek :boolean data tipinde emekli misin?sorusu için bir değişken oluşturun ve false atayin

        boolean isRetired = false;
        System.out.println(isRetired);

        System.out.println("---------------------");

        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        boolean b4=false;

        System.out.println(b1 && b2);
        System.out.println(b2 || b3);
        System.out.println(b2 && b4);
        System.out.println(b3 || b4);

        System.out.println("---------------------");

        //System.out.println(); ile System.out.print(); arasındaki fark nedir?
        //System.out.println(); ekrana bir şey yazdırdıktan sonra otomatik yeni satıra geçer.
        //System.out.print(); ekrana yazdırır ama yeni satıra geçmez.

        System.out.print("Merhaba ");
        System.out.print("Dunya");
    }


    }

