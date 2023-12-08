package d19static_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;
    {
        color="Siyah";
        fuelType="Benzin";
    }
//constructor
    public InstanceBlock3(){
        System.out.println("Araba rengi:"+color);
        System.out.println("Araba Yakit Turu:"+fuelType);
    }

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}
