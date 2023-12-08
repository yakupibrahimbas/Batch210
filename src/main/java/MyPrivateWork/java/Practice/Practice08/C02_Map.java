package MyPrivateWork.java.Practice.Practice08;

import java.util.HashMap;
import java.util.Map;

public class C02_Map {
            /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */

    public static void main(String[] args) {

        HashMap<String, Double> urunFiyatlari = new HashMap<>();
        urunFiyatlari.put("Kemer", 19.99);
        urunFiyatlari.put("Gomlek", 29.99);
        urunFiyatlari.put("Ayakkabi", 89.99);
        urunFiyatlari.put("Kazak", 24.99);
        urunFiyatlari.put("Kravat", 19.99);
        System.out.println(urunFiyatlari);

        double urunFiyTop = fiyatTopla(urunFiyatlari); //bu method bana mapteki her bir valueyi dondursun.

        System.out.println(urunFiyTop);
    }


    public static double fiyatTopla(HashMap<String, Double> urunFiyatlari) {

        double toplam = 0;
        for (Map.Entry<String, Double> each : urunFiyatlari.entrySet()) {
            //mapten gelen her elamani entry olarak aldim

            toplam = toplam + each.getValue();
        }
return toplam;
    }



}

