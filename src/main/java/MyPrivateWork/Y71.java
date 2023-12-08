package MyPrivateWork;

import java.util.Arrays;

public class Y71 {
    public static void main(String[] args) {
        int[] ages=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;


        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);







    }
}
