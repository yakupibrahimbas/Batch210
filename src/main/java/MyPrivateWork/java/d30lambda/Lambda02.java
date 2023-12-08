package MyPrivateWork.java.d30lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
    // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
    // stream kullanilmadan cagirilir

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("X");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Ayse");
        myList.add("Zeynep");
        myList.add("MustafaX");

     //   removeIfLengthGreaterThanFive(myList);
     //   removeIfElementsStartsWithZorEndsWithf(myList);
     //   removeIfElementsStartsWithZorEndsWithf2(myList);
        removeIfElementsContainsX(myList);
    }

    public static void removeIfLengthGreaterThanFive(List<String>myList){
        myList.removeIf(t->t.length()>5);
        System.out.println(myList);
    }

//2 ) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.


    public static void removeIfElementsStartsWithZorEndsWithf(List<String>myList){
        myList.removeIf(t-> t.charAt(0)=='Z'||t.charAt(t.length()-1)=='f');
        System.out.println(myList);
    }
    public static void removeIfElementsStartsWithZorEndsWithf2(List<String>myList){
        myList.removeIf(t->t.startsWith("Z")||t.endsWith("f"));
        System.out.println(myList);
    }
    //X karakterlieleri silin

    public static void removeIfElementsContainsX(List<String>myList){
        myList.removeIf(t->t.contains("X"));
        System.out.println(myList);
    }
}
