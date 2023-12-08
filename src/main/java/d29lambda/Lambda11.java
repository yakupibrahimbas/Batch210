package d29lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda11 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        List<String>donusList=bestenCokBuyuk(myList);
        System.out.println(donusList);
    }

    public static List<String>bestenCokBuyuk(List<String>myList){
        return myList.stream().filter(t-> t.length()>5).map(String::toUpperCase).collect(Collectors.toList());
    }
}
