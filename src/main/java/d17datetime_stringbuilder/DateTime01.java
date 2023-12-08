package d17datetime_stringbuilder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //Date Data Tipi (Class)

        //ornek 1: now(): Geçerli tarihi alır.Tarih bilgisini yerel bilgisayarınızın saatinden alır, yani sizin bilgisayarınızın saatinden gelir

        LocalDate myDate = LocalDate.now(); //now()statik bir methoddur.
        System.out.println(myDate);

        String s = "Elma";
        String s2 = new String("Elma");

        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
        //Java’da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
        //Degisme ihtimali olmayan datalari depolamak icin kullanilir.Haftanin gun isimleri, Ay isimleri gibi

        System.out.println(myDate.getMonthValue());
        Month ay = myDate.getMonth();
        System.out.println(ay);

        //ornek 3: getYear(): Tarihin yılını alır.

        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfYear());

        //ornek 4:getDayOfMonth(): Ayin gününü alır.
        //ileriki tarihe nasil gidilir?
        int gun = myDate.getDayOfMonth();
        System.out.println(gun);

       DayOfWeek gun2= myDate.getDayOfWeek();
        System.out.println(gun2);

        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        // Bu methodlar, orijinalleri değiştirmez, yeni bir gun,ay ve tarih nesnesi oluşturur.

       LocalDate newDate= myDate.plusYears(1).plusMonths(2).plusDays(4);
        System.out.println(newDate);
        LocalDate newDate2=myDate.minusYears(1).minusMonths(5).minusDays(10);
        System.out.println(newDate2);

        //ornek 7: Specifik bir tarih objesi nasil olusturulur?
        //of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.

        LocalDate date1=LocalDate.of(1980,8,3);
        LocalDate date2=LocalDate.of(2010,5,4);
        System.out.println("date 1="+date1+",date2="+date2);
        Boolean sonrami=date1.isAfter(date2);
        System.out.println(sonrami);
        Boolean oncemi=date1.isBefore(date2);
        System.out.println(oncemi);

        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen verilen sirada tarih bilgisini giriniz.yil-ay-gun");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        //Kullanicidan alinan verilerle bir tarih olusturalim.
        LocalDate girilenTarih= LocalDate.of(year,month,day);
        if (girilenTarih.isBefore(LocalDate.now())){
            System.out.println("Gecersiz tarih girdiniz");
        }else {
            System.out.println("zamani girebilirsiniz");

        }

        //ornek 9: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println("Lutfen verilen sirada tarih bilgisini giriniz.yil-ay-gun");
        int y=input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();

        LocalDate date=LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());
    }
}
