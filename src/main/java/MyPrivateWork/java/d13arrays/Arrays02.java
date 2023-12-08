package MyPrivateWork.java.d13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        // [12, 3, -3, 5, 23] ==> 3, -3

int[]numbers={12,3,-3,5,23};
        System.out.println(Arrays.toString(numbers));
        for (int w:numbers){
            if (w<5){
                System.out.print(w+ " ");
            }

        }
        System.out.println("---------------------");

        String names[] = {"A", "T", "K", "E", "B"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); //[A, B, E, K, T]
        int result = Arrays.binarySearch(names,"B"); //1. index'te
        System.out.println(result);

        int[]arr={2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));




    }
}
