package MyPrivateWork;

import java.util.Arrays;

public class Y104 {
    public static void main(String[] args) {

        int[][]a =new int[3][2];
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=5;
        System.out.println(Arrays.deepToString(a));
        System.out.println(a[1][1]);
        System.out.println(Arrays.toString(a[2]));
        String [][] students={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"}};
        int toplam=0;
        for (String []w:students){
            toplam=toplam+w.length;

        }
        System.out.println(toplam);
        for (String[]w:students){
            for (String k:w){
                if (k.contains("han")){
                    System.out.println(k);
                }
            }
        }

    }
}
