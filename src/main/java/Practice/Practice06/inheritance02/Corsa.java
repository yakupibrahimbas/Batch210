package Practice.Practice06.inheritance02;

import java.util.ArrayList;
import java.util.List;

public class Corsa extends Opel{
    String hiz="Corsa max 200 km hiz yapar";
    String yakit="Corsa arabalar benzinlidir";
    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanir");
    }

    @Override
    protected void yakitTuketim() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketirler");
    }
    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    public static void main(String[] args) {

        Corsa arb1=new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);
        System.out.println("arb1.hiz = " + arb1.hiz);
        System.out.println("arb1.yakit = " + arb1.yakit);
        System.out.println("arb1.marka = " + arb1.marka);
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);
        System.out.println("arb1.model = " + arb1.model);
        arb1.motor();


        Opel arb2=new Corsa();
        List<String>list=new ArrayList<>();
        System.out.println("arb2.hareket = " + arb2.hareket);
        System.out.println("arb2.hiz = " + arb2.hiz);
        System.out.println("arb2.yakit = " + arb2.yakit);
        System.out.println("arb2.marka = " + arb2.marka);
        arb2.motor();

    }
}
