package MyPrivateWork.java.d11loops;

public class WhileLoops01 {
    public static void main(String[] args) {
        //------------for
      /*  for (baslangic degeri;loop_calisma kurali;artirma/azaltma){
            //calisacak kodlar
                    }*/
        //-----------while
        //baslangic degeri
      /*  while (loop_calisma kurali){
            //calisacak kodlar
            artirma/azaltma
                    }*/
//-----------------------------------------------------------------------
      //  3'den 6'ya kadar tamsayilari console’a yazdiriniz (3 ve 6 dahil)

        //1.yol
        for (int i = 3; i <7 ; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        //2.yol while dongusu
        int i=3;
        while(i<7){
            System.out.println(i);
            i++;
        }
        //------------------
        System.out.println("---------------------");
//Ornek 2: 23'den 12'ye kadar cift tamsayilari console’a yazdiriniz(12 dahil)

int k=23;
while (k>11){
if (k%2==0){
    System.out.println(k);
}
k--;
}






    }
}
