package MyPrivateWork.java.d3datatypesconcatenationscanner;

public class WrapperClass {
    public static void main(String[] args) {
        //Java primitive data tiplerine yeni özellikler(methodlar) ekleyerek yeni bir yapı oluşturdu.
        //Bu yapıya wrapper(saralayı) class denir. En önemlisi girdiğimiz veriler üzerinde method
        //kullanımının yolu açılmış olur. Wrapper class'lar non primitivedir.

        //primitive : char - boolean - byte - short - int - long - float -double
        //wrapper class: Character- Boolean - Byte - Short - Integer- Long - Float - Double

        int i=12;
        Integer k=12;
        System.out.println(i);

        //Javada primitive ve wrapper class'lari arasında oromatik dönüşüm yapabilen
        //autoboxing ve unboxing mekanizmaları vardır. Primitive'i wrapper'a çevirir.
        //Örneğin int'i Integer'a çevirir. Unboxng ise tam tersi bir işlem yapar,Integer'i int'e
        //dönüştürür.

        //unboxing

        int num= 13;
        Integer wrapperNum= num;
        System.out.println(wrapperNum);

        Byte s = 19;
        byte primitiveS=s;
    }
}
