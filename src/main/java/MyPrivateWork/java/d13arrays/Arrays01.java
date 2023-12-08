package MyPrivateWork.java.d13arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        // bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz


        int[] ages=new  int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

     //   Arrays.sort(ages);
     //   System.out.println(Arrays.toString(ages));
     //   System.out.println(ages[0]+ages[ages.length-1]);

        //-------------------------
       int minimum=ages[0];
       int maksimum=ages[0];


       for (int w :ages){
          minimum= Math.min(minimum,w);
          maksimum=Math.max(maksimum,w);

       }
        System.out.println(minimum);
        System.out.println(maksimum);


    }
}
