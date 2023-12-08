package MyPrivateWork.java.MyPrivateWork;

import java.util.Arrays;

public class Y103 {
    public static void main(String[] args) {

        int[]arr={0,2,4,0,12,0};
        int[]yeniArr=new int[arr.length];
        System.out.println(Arrays.toString(yeniArr));

        int ilkIndex=0;
        for (int w:arr){
            if (w!=0){
                yeniArr[ilkIndex]=w;
                ilkIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));

        int[]a =new int[3];
        a[0]=2;
        a[1]=1;
        a[2]=3;
        int[]b=new int[3];
        b[0]=2;
        b[1]=1;
        b[2]=3;


       boolean result= Arrays.equals(a,b);
        System.out.println("result="+result);



    }
}
