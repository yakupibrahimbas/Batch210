package d16overloading_varrags_passbyvalue_constructors;

public class Car {
 /*   Constructor nedir?
        Classtan object olusturmamizi saglayan bolumdur.
                Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
        Bu constructor'lara "default constructor" denir.
        default constructor ===> Car ()
        //-----------------------------------------------

     Ama car class'i bize hep ayni degerleri gonderir. Bu class'i kullanip farkli degerler olusturabiliriz
        Kendiniz constructor'inizi olusturdugunuz zaman Java default constructor'i siler

        constructor nasil olusturulur?

                Access Modifier + Class ismi + () + {} */



    String brand="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid=true;

    public void hareket(){
        System.out.println(brand+"hizli hareket eder");
    }
    public void dur(){
        System.out.println(brand+"guvenli bir sekilde durur");
    }

    //Dikkat: bunlari olusturunca CarRunner (main'li) calistirici class'i olusturalim.

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    public Car(String brand, String model, int year, boolean hybrid){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
