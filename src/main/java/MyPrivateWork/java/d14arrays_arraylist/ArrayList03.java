package MyPrivateWork.java.d14arrays_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        // [J, a, v, a, v] ==> [J, a, v]

        List<Character> a=new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);
        List<Character>b=new ArrayList<>();
        for (Character w:a){
            if (!b.contains(w)){
                b.add(w);
            }
        }

        System.out.println(b);



    }
}
