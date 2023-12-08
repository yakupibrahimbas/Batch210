package d25maps_exceptions;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {


        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

/*Thread safe (iş parçacığı güvenliği), bir yazılımın birden fazla iş parçacığı tarafından aynı anda
güvenle kullanılabilmesidir. Thread safe bir yazılım örneği, bir banka hesabını yöneten bir
sistemdir. Bu sistem, birden fazla müşterinin aynı anda hesabına erişebilmesine
izin vermelidir ve bu nedenle thread safe olmalıdır.

Multi thread (çok iş parçacıklı), bir yazılımın birden fazla iş parçacığı tarafından aynı anda
çalıştırılmasıdır. Bu, yazılımın daha hızlı ve verimli çalışmasına izin verebilir.
Multi thread bir yazılım örneği, bir web tarayıcısıdır. Bir web tarayıcısı,
aynı anda birden fazla web sayfasını açabilir ve bu nedenle multi thread'dir.

Synchronized olması ise, bir veri yapısının aynı anda sadece bir iş parçacığı
tarafından kullanılabilmesi anlamına gelir.*/

/*HashMap ile HashTable arasindaki fark nedir?

1)  a) HashMap non-synchronized'dir.Yani, birden fazla iş parçacığı aynı anda bir
HashMap'e erişebilir. Aynı anda birden fazla müşteri hesap bilgilerine erişebilir.
Bu, örneğin bir müşteri para çekerken, başka bir müşteri aynı anda hesaba para yatırırsa,
hesabın bakiyesinin yanlış olmasına yol açabilir.(thread-safe de degildir)
Ancak bu durumda senkronizasyon işlemleri manuel olarak yönetilmelidir.
(programci Synchronized Bloklar, Lock ve Semapforlar gibi ozel yapilar kullanir.)

    b) HashTable thread-safe ve synchronized'dir
( yani aynı anda sadece bir iş parçacığı aynı Hashtable'i kullanabilir.
 kuyruk olusur ve hizmet suresi uzar)

2) a)HashMap bir tane null key'e (unique olmali, 2 null olamazdi, ustune yazar) ve
        istediginiz kadar null value'a musaade eder
   b)Hashtable, anahtarlar ve değerler için null değerlerine izin vermez.
   Herhangi bir null değer eklemeye çalışırsanız, NullPointerException alırsınız.

3) HashMap hizlidir, HashTable HashMap'e gore yavastir

Not: HashMap'ler ve HashTable'lar entry'leri rastgele siralar*/

/*--------------------
Hangi veri yapısını kullanmalısınız?

Senkronizasyona gerek yoksa, HashMap kullanın. Bu, daha yüksek performans sağlayacaktır.
Senkronizasyon gerekliyse, Hashtable kullanın. Bu, veri tutarsızlığı riskini azaltacaktır.
 */


        Hashtable<String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Selma", 70);
        ogrenciNotlari.put("Turgay", 35);
        ogrenciNotlari.put("Sefa", 17);
        ogrenciNotlari.put("Said", 83);
        ogrenciNotlari.put("Ali", 50);
        ogrenciNotlari.put("Ahmet", 25);

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 38);
        stdAges.put(null, 41);
        stdAges.put("a", null);
        stdAges.put("b", null);
        System.out.println(stdAges);

/*
1) Treemap'ler entry'leri natural order'a gore siraya koyar, bu yuzden cok yavastirlar
2) Treemap'ler  thread-safe ve synchronized degildir.
3) Treemap'lerin key'lerinde null kullanilamaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
4) Treemapler key'e bakarak siralama yapar
 */
        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        countryPopulation.put("Italy", null);
        System.out.println(countryPopulation);

        /*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.*/

        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("Ali",25);
        lhm.put("Can",18);
        lhm.put("Mehmet",45);

        for (Map.Entry<String,Integer>entry:lhm.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());

        }


    }
}