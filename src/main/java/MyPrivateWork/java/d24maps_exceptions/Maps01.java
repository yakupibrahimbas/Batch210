package MyPrivateWork.java.d24maps_exceptions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        //Map'ler sozluk gibidir. Aciklamalidir. orn: Ali = 13;
        //Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir
        //key tarafi icin set kullanilir. Value tarafi icinse List, data sayisindan eminsekte Array kullanabiliriz
        //Map'in elemanlarina komple "entry set - giris elemani" denir


        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Ali Can", 13);
        myMap.put("Veli Can", 18);
        myMap.put("Ayse Kaya", 15);
        myMap.put("Fatma Yilmaz", 19);
        myMap.put("Ali Can",25);
        System.out.println(myMap);

        //Sadece 'key' degerlerini nasil alabiliriz?

        Set<String>keyTarafi=myMap.keySet();
        System.out.println(keyTarafi);

        Collection<Integer>valueTarafi=myMap.values();
        System.out.println(valueTarafi);

        Integer yas=myMap.get("Ali Can");
        System.out.println(yas);

        //------------------------
        int toplam=0;
        Collection<Integer>yaslar=myMap.values();
        System.out.println(yaslar);
        for (Integer w:yaslar){
            toplam=toplam+w;
        }
        System.out.println(toplam/yaslar.size());

        System.out.println("--------------");
        //entrySet() metodu, HashMap’in tüm degerlerini içeren bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop’lar direkt Map’ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set’in icinde Map yapisi saklanir.

        System.out.println(myMap);
        Set<Map.Entry<String,Integer>>myEntrySet=myMap.entrySet();
        System.out.println(myEntrySet);
        for (Map.Entry<String,Integer>w:myEntrySet){
            System.out.println(w);
        }

        HashMap<String,Integer> kisiler = new HashMap<>();
        kisiler.put("Ali", 3);
        kisiler.put("Can", 5);
        kisiler.put("Ayse", 2);

        int sum=0;
        Set<Map.Entry<String,Integer>>mySet=kisiler.entrySet();
        System.out.println(mySet);

        for (Map.Entry<String,Integer> w:mySet){
            sum=sum+w.getKey().length()+w.getValue();

        }
        System.out.println(sum);

    }

}
