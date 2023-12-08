package d29lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda13 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        tekrarsizBuyuk(myList);
    }
    public static void tekrarsizBuyuk(List<String>myList){
        myList.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t+" "));
    }
}
