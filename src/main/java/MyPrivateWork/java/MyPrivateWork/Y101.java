package MyPrivateWork.java.MyPrivateWork;

import java.util.Arrays;

public class Y101 {
    public static void main(String[] args) {

        int[] numbers={12,3,-3,5,6};
        System.out.println(Arrays.toString(numbers));
        for (int w:numbers  ) {
            if (w<5){
                System.out.print(w+" ");
            }
        }

        //-------------------------

        String names[]={"A","T","K","E,","B"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int result=Arrays.binarySearch(names,"B");
        System.out.println(result);

        int []arr={2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,4));



    }
}
