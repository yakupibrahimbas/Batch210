package d15arraylist_methodcreation_overloading;

import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //asList kullanarak kisa yoldan eleman eklemenin bazi handikaplari vardir.
        //Arka planda Array gibi calismaya baslar.
        //List'in eleman sayisini degistiren methodlari kullanamazsiniz
        //ornegin remove(),add() kullanamazsiniz
        //ama set() veya size() hala kullanabilirsiniz


        List<Integer>myList= Arrays.asList(1,3,4,9,7);

      //  myList.remove(0);
      //  myList.add(5);

        myList.set(0,5);
        System.out.println(myList);
    }
}
