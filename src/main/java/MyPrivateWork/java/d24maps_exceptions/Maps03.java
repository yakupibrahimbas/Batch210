package MyPrivateWork.java.d24maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {

        //Meshur bir interview sorusu

        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //           Ali nasilsin Ali.
        // Ali=2, nasilsin=1 elde etmeliyim

        String s = "Ali nasilsin Ali.";
        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s); //ali nasilsin ali ==> tek bir data, karsilastirma yapmam icin kelimelere
        //ayirmam lazim, bosluktan kesersem 3 ayri data olurlar

        String[] kelimeler = s.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[ali, nasilsin, ali]

        HashMap<String, Integer> myMap = new HashMap<>();
        System.out.println(myMap); //{                                            } bos bir map actik.

        //[ali, nasilsin, ali]
        for (String  w : kelimeler){

            Integer gorunum = myMap.get(w); //w ==> key bana Integer value'yu verecek
            //ilk dongude Map'te ali olmadigindan null getirecek
            if (gorunum == null){
                myMap.put(w, 1);
            }else {

                myMap.put(w, gorunum+1);
            }
        }
        System.out.println(myMap); //{nasilsin=1, ali=2}

    }
}