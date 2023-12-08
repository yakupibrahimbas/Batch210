package MyPrivateWork.java.d4castingscannerincrementif;

public class TypeCastingNT {
    public static void main(String[] args) {
//Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
//byte - short - int - long - float - double

//Not 1 :Kucuk data type'lerini buyuk data type'larina cevirmeyi cevirmeyi Java otomatik olarak yapar.
//Bu isleme AutoWidening (otomatik genisletme) denir.

//byte      - short         - int       - long              - float         - double

//Not 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir.
//Veri kaybi olusabilir. Java bu islemi otomatik yapmaz. Kod yazana birakir.
//Bu isleme "Explicit Narrowing" (aciktan daraltma) denir.


byte age =13 ;
int ageInt=age;

        int weight = 313;

        short weightShort = (short) weight;
        System.out.println(weightShort);
    }
}
