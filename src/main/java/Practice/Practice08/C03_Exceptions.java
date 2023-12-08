package Practice.Practice08;

import java.util.Random;

public class C03_Exceptions {
    /*
rastgeleSayiBol isminde bir method oluşturunuz.
bu methodda 2 tane int random sayı olusturunuz
ilk sayiyi ikinci sayiya bolerek sonucu ekrana yazdırınız


rastgeleSayiTopla isminde bir method olusturunuz
Bu method içerisinde iki int random sayı oluşturunuz. (0'dan 10 a kadar)
Bu iki random sayının toplamını yazdırın ANCAK
Eğer bu iki random sayının toplamı 12 den küçükse kodunuz "Exception" versin ve mesaj olarak
("Toplam 12'den küçük ise hata verir") yazdırsın.
*/
    public static void main(String[] args) {
        rastgeleSayiyiBol();
        rastgeleSayiTopla();


    }

    private static void rastgeleSayiTopla() {
        Random random=new Random();
        int sayi1=random.nextInt(11);
        int sayi2=random.nextInt(11);

        System.out.println("sayi1"+ sayi1);
        System.out.println("sayi2"+ sayi2);
        try {
            if (sayi1+sayi2<12){
                throw new Exception();
            }else {
                System.out.println(sayi1+sayi2);
            }
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("sayilarin toplami 12 den kucuk");
            System.out.println(e.getMessage());
        }
    }

    private static void rastgeleSayiyiBol() {

        Random random=new Random();
        int sayi1=random.nextInt(11);
        int sayi2=random.nextInt(2);
        System.out.println("sayi1="+sayi1);
        System.out.println("sayi2="+sayi2);
        try {
            System.out.println(sayi1/sayi2);
        } catch (Exception e) {
            System.out.println("Bolme isleminde sonuc tanimsiz" +
                    "");
        }
        System.out.println("Kod calismaya devam ediyor");
    }
}
