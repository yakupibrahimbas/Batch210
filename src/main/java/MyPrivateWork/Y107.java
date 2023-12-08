package MyPrivateWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Y107 {
    public static void main(String[] args) {
        ArrayList<Integer>ages=new ArrayList<>();
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

        //--------------------------------

        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages);
        ages.addAll(0,newAges);
        System.out.println(ages);


        //-------------------------
        int elemanSayisi=ages.size();
        System.out.println(elemanSayisi);

        int eleman=ages.get(3);
        System.out.println(eleman);

        ages.set(1,25);
        System.out.println(ages);

    }
}
