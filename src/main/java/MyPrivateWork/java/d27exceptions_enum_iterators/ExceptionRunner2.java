package MyPrivateWork.java.d27exceptions_enum_iterators;

public class ExceptionRunner2 {
    public static void main(String[] args) {
        ogrenciSayisi(45);

    }//

    public static void ogrenciSayisi(int sayi){
        if (sayi<0){
            throw  new InvalidNumberException("Bir okuldaki ogrenci sayisi negatif olamaz");
            //runtime exception turunde bir exception cagirdik.Hata varsa run sonrasi ortaya cikacak

        }else {
            System.out.println(sayi);

        }

    }
}
