package MyPrivateWork.java.d30lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

kucuktenBuyuge(myList);

    }

    public static void kucuktenBuyuge(List<String>myList){
        myList.stream().distinct().map(String::toLowerCase).
                sorted(Comparator.
                comparing(String::length)).
                forEach(Utils::printTheSameLineWithSpace);

    }
}
