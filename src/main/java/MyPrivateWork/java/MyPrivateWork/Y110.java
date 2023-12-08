package MyPrivateWork.java.MyPrivateWork;

import java.util.ArrayList;

public class Y110 {
    public static void main(String[] args) {
        ArrayList<String> r=new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);

      /*  for (String w:r){
            if (w.contains("a")){
                r.remove(w);
            }
        } */

        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a")){
                r.remove(i);
            }
        }
        System.out.println(r);
    }
}
