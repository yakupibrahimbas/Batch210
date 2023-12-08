package Practice.Practice05;

import java.util.Arrays;

public class C01MDA {
    public static void main(String[] args) {

        /*
        mdarray olusturun yazdırın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */
        int[][] arr1=new int[3][2];//{{0,0},{0,0},{0,0}}
        int [][] arr ={{3,33},{-8,6,9,-1},{14,10,3}};
        System.out.println(Arrays.deepToString(arr));


        int[] brr=new int[arr.length]; //bu arraye arr arayinin her bir ic arrayinin elemanlari toplamini koyacagim.

       /* int idx=0;

        for (int[] each:arr) {
            int toplam=0;
            for (int each2:each) {
                toplam+=each2;
            }
            brr[idx]=toplam;
            idx++;
        }
        System.out.println(Arrays.toString(brr)); */

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[1];
            int toplam=0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
            brr[i]=toplam;
        }


    }
}
