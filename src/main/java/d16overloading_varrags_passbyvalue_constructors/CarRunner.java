package d16overloading_varrags_passbyvalue_constructors;

public class CarRunner {
    public static void main(String[] args) {

            //4- Car class'indan bir object uretelim cunku method'lar statik degil
            //8- default constructor silindi. Bizim olusturdugumuza argumanlari girelim

            Car c1 = new Car("BMW","3.20",2023,false);
            System.out.println(c1.brand); //Honda
            System.out.println(c1.model); //Accord
            System.out.println(c1.year); //2023
            System.out.println(c1.hybrid); //true

            c1.hareket(); //Honda hizli hareket eder. hareket() methodu non-static'tir
            c1.dur(); //Honda guvenli bir sekilde durur

            //5- car class'a geri donelim. constructor'i ogrenelim

            System.out.println(c1);

            Car c2 = new Car("Audi", "A4", 2018, false);
            System.out.println(c2);
            //9- adresi verdi. bunu duzeltmek icin car class'inin icinde toString olusturmaliyiz.
            Car c3=new Car("Fiat","Sahin");
        System.out.println(c3);
        }
    }