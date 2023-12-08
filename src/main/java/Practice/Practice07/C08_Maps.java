package Practice.Practice07;

import java.util.HashMap;

public class C08_Maps {
     /*
İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
    input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
    output : {John=Doe, Mark=Twain, Ali=Can};
 */


    public static void main(String[] args) {

        String [] isimler={"John","Mark","Ali"};
        String [] soyisimler={"Doe","Twain","Can"};

        HashMap<String,String>map=new HashMap<>();
        for (int i = 0; i < isimler.length; i++) {
            map.put(isimler[i],soyisimler[i]);
        }
        System.out.println(map);




    }

}
