package MyPrivateWork;

import java.util.ArrayList;

public class Y108 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list);

        for (Integer w:list){
            if (w%2!=0){
                list.set(list.indexOf(w),11);
            }
        }
        System.out.println(list);
    }
}
