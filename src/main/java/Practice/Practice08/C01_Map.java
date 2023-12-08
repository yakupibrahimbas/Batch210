package Practice.Practice08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_Map {
    public static void main(String[] args) {

          /*
        Soru : Verilen bir array'de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        Input : {1,1,2,3,4,5,3,4,2,5,1,3,2,4,1}
        output : 1 kullanimi : 3 adet
                2 kullanimi : 3 adet
                3 kullanimi : 3 adet
                4 kullanimi : 3 adet
                5 kullanimi : 2 adet

         */


        int[]arr={1,1,2,3,4,5,3,4,2,5,1,3,2,4,1};
        Map<Integer,Integer>map=new HashMap<>();
        System.out.println(map);
        //hedef:{1=4,2=3,3=3,4=3}

        for (int each:arr) {

            if (map.containsKey(each)){//gelen each mapte key degeri olarak varsa
                map.put(each,(map.get(each)+1));

            }else { //gelen each key degeri olarak mapte yoksa
                //each'i map'e key olarak ekle,value degeri olarakta 1 ver

                map.put(each,1);

            }

        }

        System.out.println(map);
        Set<Map.Entry<Integer,Integer>>entries= map.entrySet();
        for (Map.Entry<Integer,Integer>w:entries){
            System.out.println(w.getKey()+" kullanimi: "+w.getValue()+" adet");
        }

    }
}
