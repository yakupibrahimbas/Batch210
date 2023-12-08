package MyPrivateWork.java.d19static_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 car1=new InstanceBlock3();
        InstanceBlock3 car2=new InstanceBlock3("Kirmizi","Dizel");
        System.out.println("Araba rengi = " + car2.color);
        System.out.println("Araba yakit turu:"+car2.fuelType);
        InstanceBlock3 car3=new InstanceBlock3();
    }
}
