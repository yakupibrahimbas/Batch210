package d12loopsarrays;

import javax.xml.datatype.DatatypeConstants;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Array olusturmak

        String[] stdNames1 = new String[3];
        String stdNames2[] = new String[4];
        System.out.println(stdNames1);
        System.out.println(Arrays.toString(stdNames1));

//------------------------
        System.out.println("-----------");

//ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz


        int[] notlar = new int[5];
        System.out.println(Arrays.toString(notlar));

//ornek: 10 elemanli integers adinda, Integer bir arrray olusturunuz ve console’a yazdiriniz

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
//ornek: 3 elemanli isimler adinda, String bir arrray olusturunuz ve console’a yazdiriniz
        String[] isimler = new String[3];
        System.out.println(Arrays.toString(isimler));
        isimler[0] = "Ali Can";
        isimler[1] = "Veli Han";
        isimler[2] = "Ayse Kaya";
        System.out.println(Arrays.toString(isimler));
        System.out.println(isimler[1]);

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
//icerdigi karakter sayilari toplamini ekrana yazdirin.

        String[]cities=new String[5];
        cities[0]="Bayburt";
        cities[1]="Sivas";
        cities[2]="Denizli";
        cities[3]="Adana";
        cities[4]="Ankara";
int totalChar=0;
        for (int i = 0; i < cities.length; i++) {
            totalChar=totalChar+cities[i].length();
        }

        //for each loop:
        //for loop'taki baslangic,bitis,artirma-azaltma olaylarini dusunmeyiz.
    /*    for (Datatype variable)Arrays yada collections){

        }*/
        int sum=0;
        for (String w:cities){
            sum=sum+w.length();

        }

        System.out.println(sum);
    }
}
