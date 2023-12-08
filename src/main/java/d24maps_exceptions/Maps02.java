package d24maps_exceptions;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        stdAges.replace("Tom",39);
        System.out.println(stdAges);

        stdAges.replace("Tom",21,45);
        System.out.println(stdAges);
        System.out.println("--------------");
        stdAges.putIfAbsent("Tom",77);
        System.out.println(stdAges);
        stdAges.putIfAbsent("Ayse",23);
        System.out.println(stdAges);
        System.out.println("-----------");
        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom",-1));
        System.out.println(stdAges.get("Jerry"));
        System.out.println(stdAges.getOrDefault("Jerry",-1));

        Boolean b=stdAges.containsValue(19);
        System.out.println(b);

        System.out.println(stdAges.containsValue(99));
        System.out.println(stdAges.containsKey("TOM"));
        System.out.println(stdAges.containsKey("Tom"));
        System.out.println("--------------");

        //6)remove(“Tom”); methodu key kullanarak entry silmeye yarar

        stdAges.remove("Tom");
        System.out.println(stdAges);
        stdAges.remove("Can",19);
        System.out.println(stdAges);






    }
}
