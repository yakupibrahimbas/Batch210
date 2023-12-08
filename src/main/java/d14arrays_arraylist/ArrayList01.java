package d14arrays_arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
ArrayList, dinamik bir dizi yapısıdır. Bu, ArrayList'in boyutunun, elemanlar ekleme veya çıkarma sırasında otomatik olarak ayarlanabileceği anlamına gelir.

ArrayList, primitive'leri depolayamaz çünkü primitive'ler, referans türleri değildir. Referans türleri, bir Objeye işaret eden bir referanstır. Primitive'ler ise doğrudan bir değerdir.

Gerçek hayattan bir örnek olarak, bir alışveriş listesi ArrayList olarak temsil edilebilir. Alışveriş listesi, ürünlere ait isimlerin bir listesini içerir. Ürünler, String referans türleridir.
*/


/*
1)Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler non-primitive'leri (reference'lari) depolar
2)ArrayListler memory'de Array'lerden daha fazla yer kaplar
3)Array'ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
4)ArrayList'ler eleman sayisinda esnektirler.
5) Arrayleri Java niye iptal etmedi?
    a) Array'ler cok daha hizlidir
    b) Array'ler memory'de cok az yer kaplarlar
    c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir

6) Java'da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.) doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda, bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.

 */

        ArrayList<Integer> ages =new ArrayList<Integer>(); //Java 6 ve oncesi

        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages);

        ages.add(1,28);
        System.out.println(ages);
        ages.add(3,7);
        System.out.println(ages);
        ages.add(11);
        System.out.println(ages);
//---------------------------------------------------
        //Ornek 1: Verilen Integer List’i ages List’inin icine koyunuz

        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(0,newAges);
        System.out.println(ages);


        int elemanSayisi = ages.size();
        System.out.println(elemanSayisi);

        int eleman = ages.get(3);
        System.out.println(eleman); //9

        ages.set(1,25);
        System.out.println(ages);



    }
}
