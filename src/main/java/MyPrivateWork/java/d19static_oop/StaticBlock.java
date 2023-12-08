package MyPrivateWork.java.d19static_oop;

import java.time.LocalDate;

public class StaticBlock {

     /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
 Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
 Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
 bir şekilde hazır olmasını sağlar.*/

//Bir variable olusturdugunuzda deger atamazsiniz, o variable initialize (baslatmak) etmediniz demektir

//Senaryo: Subat ayinda fiyatlarda indirim olacak.Class cagirildiginda otomatik price’i alacak ve class’in heryerinde bu degeri kullanacak




    static double pi;

    static int price;

    static {
        System.out.println("Statik blok 2");
        LocalDate currentDate=LocalDate.now();
        if (currentDate.getMonthValue()==2){
            price=1000;
            System.out.println(price);
        }else {
            price=2000;
            System.out.println(price);

        }



    }


    static { //statik blok
        //scope-yasam alani
        //statik bloklar icinde degisken tanimlanmaz ama deger atanir.
        pi=3.14;
        System.out.println("Static block 1");

    }


    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method ici");



    }
}
