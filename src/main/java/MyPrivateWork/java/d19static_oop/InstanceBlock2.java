package MyPrivateWork.java.d19static_oop;

public class InstanceBlock2 {
    //Eger tum constructorlarin icinde calismasi gereken ayni kodlar varsa
    //tekrardan kurtulmak icin bu kodlari instance icine yazariz.


    public int year;

    {
        System.out.println("Herkese Selam");
    }

    public InstanceBlock2(){
        System.out.println("Herkese Selam!");

    }

    public InstanceBlock2(int year) {
        //sout'u burdan silip instance blok icine koyduk.

        this.year = year;
    }
}
