package d11loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunnuz.
//            28.587 ==> 5+8+7=20
        double num = 28.5879;
        String sNum = String.valueOf(num);
        String decimalPart = sNum.split("[.]")[1];
        int intDecimalPart = Integer.valueOf(decimalPart);

        int sum=0;
        for (int i =intDecimalPart; i >0 ; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println(sum);
    }
}
