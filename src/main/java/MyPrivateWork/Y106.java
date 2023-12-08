package MyPrivateWork;

public class Y106 {
    public static void main(String[] args) {
        int [][] ages={{15,4},{12,43,21}};
        int enKucuk=ages[0][0];
        int enBuyuk=ages[0][0];

        for (int[] w:ages){
            for (int k:w){
               enKucuk= Math.min(enKucuk,k);
               enBuyuk=Math.max(enBuyuk,k);
            }
        }
        System.out.println(enKucuk);
        System.out.println(enBuyuk);
    }
}
