package MyPrivateWork;

import java.util.Arrays;

public class Y105 {
    public static void main(String[] args) {

        int[][]numbers={{5,4},{2,3,2}};
        int toplamElemanSayisi=0;
        for (int[]w:numbers){
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }
        System.out.println(toplamElemanSayisi);

        int[] newArr=new int[toplamElemanSayisi];
        System.out.println(Arrays.toString(newArr));

        int idx=0;
        for (int[]w:numbers){
            for (int k:w){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
