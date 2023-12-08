package MyPrivateWork.java.Practice.Practice04;

import java.util.Arrays;

public class C03ArrayeElemanEkleme {
    public static void main(String[] args) {
        /*
        verilen arraye istenen bir elemanı ekleyen bir kod yazınız
        int [] arr={1,4,7,11};
        eklenecek eleman = 5 ;
         */

        int[] arr={1,4,7,11};
        int eklenecek=5;
        System.out.println(Arrays.toString(arr));
        int [] brr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            brr[i]=arr[i];

        }

        System.out.println(Arrays.toString(brr));
        brr[brr.length-1]=eklenecek;
        System.out.println(Arrays.toString(brr));


    }
}
