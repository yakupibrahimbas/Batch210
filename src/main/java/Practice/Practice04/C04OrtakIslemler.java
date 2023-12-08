package Practice.Practice04;

import java.util.ArrayList;
import java.util.List;

public class C04OrtakIslemler {
    public static void main(String[] args) {

        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitivity olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : [brad,sofia,emily]
         */

        String[] arr={"John","Brad","Angel","Sofia","Emily"};
        String[] brr={"sofia","brad","grace","emily","hazel"};

        List<String> ortakIsimler =new ArrayList<>();
        for (String each1:arr) {
            for (String each2:brr) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }
            }
        }
        System.out.println(ortakIsimler);
    }
}
