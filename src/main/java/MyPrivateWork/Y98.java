package MyPrivateWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Y98 {
    public static void main(String[] args) {

      /*  String [] stdNames1=new String[3];
        //System.out.println(stdNames1);
        System.out.println(Arrays.toString(stdNames1));
        */

        int[]notlar=new int[5];
        System.out.println(Arrays.toString(notlar));

        //----------------------------------
        System.out.println("--------------");

        Integer [] integers=new Integer[10];
        System.out.println(Arrays.toString(integers));

        //----------------------------------
        System.out.println("--------------");

        String []isimler=new String[3];
        System.out.println(Arrays.toString(isimler));

        //----------------------------------
        System.out.println("--------------");

        isimler[0]="Ali Can";
        isimler[2]="Veli Han";
        isimler[1]="Ayse Kaya";
        

        System.out.println(Arrays.toString(isimler));

        System.out.println(isimler[1]);


        
        
        String []cities=new String[5];
        cities[0]="Bayburt";
        cities[1]="Sivas";
        cities[2]="Denizli";
        cities[3]="Adana";
        cities[4]="Ankara";
        
        int totalChar=0;
        for (int i = 0; i < cities.length; i++) {
            totalChar=totalChar+cities[i].length();
        }
        System.out.println(totalChar);


//---------------------------------------------

        int sum=0;
        for (String w : cities){
            sum=sum+w.length();

        }
        System.out.println(sum);

    }
}
