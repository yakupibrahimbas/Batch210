package MyPrivateWork.java.d21oop;

public class AudiRunner {
    public static void main(String[] args) {
        AudiA4 a4=new AudiA4();
        a4.turbo();
        a4.analog();
        a4.esp();
      //  a4.run();
        ((Motor)a4).run();
        // Motor.fiyat=5000;
        //Motor. yapip fiyat'a ulastik. statik ispati
        //Motor.fiyat = 5000; //final ispati
        System.out.println(Motor.fiyat2);
        System.out.println(Klima.fiyat2);
        System.out.println(Fren.fiyat2);

        Motor.hiz();
        a4.guc();


    }
}
