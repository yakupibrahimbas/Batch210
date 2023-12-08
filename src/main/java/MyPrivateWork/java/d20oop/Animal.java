package MyPrivateWork.java.d20oop;

public class Animal {

    //OOP (Object Oriented Programming -  Nesne Tabanlı Programlama )

    //Gercek hayatta gordugumuz bircok objenin (nesnenin) bilgisayar ortamina aktarilma seklidir
    //Yani bir object'in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar
    // ortamında gösterilmesi buna örnek olarak verilebilir.

    /*Object Yönelimli Programlamanın Faydaları:

        1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
        2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
        ile çalıştırılabilir. Substring() method'u 1 kere yazilmis ama surekli kullanabiliyoruz.
        3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
        4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
        5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class' ta değişiklik
        yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/

        /* OOP'leri 4 temel özellikte inceleyebiliriz.
        1. Inheritance - Miras Alma
        2. Polymorphism - Çok Biçimlilik
        3. Encapsulation - Kapsülleme
        4. Abstraction - Soyutlama
        */

    //1.Inheritance - Miras Alma
    //Ozellikleri bir class'tan diger class'lara alan bir kavramdir

    //Siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin
    //bir cogunu kapsiyor. O zaman direkt yeni olusturdugunuz class'i, ozelliklerini kullanmak istediginiz
    //class'a child yaparsiniz

    //Bunu da "extends" keyword'u (uzanmak) kullanarak yapariz

            /*
        Inheritance'in Faydalari nelerdir?

        1) Kodun yeniden kullanılmasına yardımcı olur.
        2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve
        emekten tasarruf sağlayabiliriz.
        3) Kolayca update yapabiliriz.
        4) Class'lari kuculturuz.
        5) Daha az geliştirme ve bakım maliyetine yol açar.
        */

    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){ //Animal Data Type'tir
        return new Animal(); //yeni bir Animal objesi urettik ve cagirildigi yere return ettik
    }
    public int add(int a,int b){
        return a+b;
    }

    //Override isleminde access modifier'larin durumlari ne olmalidir, onu ogrenelim
    //Soru1: private method'lar override edilebilir mi?
    //Cevap1: private method'lar override edilemezler (parent 'eat')cunku;
    //         override edebilmek icin o method'a baska bir class'dan ulasabilmek gerekir.
    //         Ama private method'lar baska classlardan ulasilamaz methodlardir.

    //child'in access modifier'i parent'tan daha dar olamaz. Ornek: parent public - child protected
    // olamaz cunku bu hata, Child class'ının eat metodunun, Parent class'ının eat metodundan daha az
    // erişilebilir olmasından kaynaklanır.

    //return type durumlarina bakalim.

    //Parent'ta int veri turunde bir method acip, child'da override etseydik ne olurdu?
}