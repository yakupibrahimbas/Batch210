package MyPrivateWork.java.d14arrays_arraylist;

public class Md03 {
    public static void main(String[] args) {

        //Ornek 1: int turunde bir multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int [][] ages={{15,4},{12,43,21}};

        int enKucuk=ages[0][0];
        int enBuyuk=ages[0][0];

        for (int[] w:ages){
            for (int k: w){
              enKucuk= Math.min(enKucuk,k);
            }
        }

        System.out.println(enKucuk);
        System.out.println(enBuyuk);
        System.out.println(enBuyuk+enKucuk);
    }
}
