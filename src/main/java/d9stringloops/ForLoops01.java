package d9stringloops;

public class ForLoops01 {
    public static void main(String[] args) {

        //1.yol:tavsiye edilmez

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("------------------------");
        //2.yol:

       /* for (Baslangic degeri ;Loop Calisma Kurali ; Artirma/Eksiltme){
            //Calisacak kodlar
        }

        for (int i=1; i<5; i++){
            System.out.println("Hi!");
*/
            //-------------------
            //Ornek:20(dahil) den 3(dahil)e kadar tum tamsayilari console'a yazdiriniz.

            for (int i=20; i>2; i--){
                System.out.println(i);
            }

        System.out.println("-----------");
        for (int i = 3; i < 21 ; i++) {
            if (i%2==0){
                System.out.println();
            }
        }
        System.out.println("--------------");
        for (int i=4; i<21; i+=2){
            System.out.println(i);
        }
            
        }

    }

