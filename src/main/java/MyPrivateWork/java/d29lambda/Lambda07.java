package MyPrivateWork.java.d29lambda;

import java.util.*;

public class Lambda07 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        minimum1(nums);
        minimum2(nums);

    }

    public static void minimum1(List<Integer> nums){
      Integer min=  nums.stream().distinct().reduce((t,u)-> t>u?u:t).get();
        System.out.println(min);
    }


    public static void minimum2(List<Integer>nums){


        //sorted(Comparator.reverseOrder()) ifadesi,
        //Java Stream API’si içinde bir koleksiyonu ters sıralamak için kullanılır.
        //Comparator class, reverseOrder() methoddur.

        Integer min=nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);

    }
    //3.yol
    public static void minimum3(List<Integer>nums){
        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t,u)->t);

        if (min.isPresent()){ //isPresent liste dolumu kontrolu yapar.
            System.out.println(min.get()); //2
        }else {
            System.out.println("Liste bos veya minimum deger bulunamadi");
        }    }
}
