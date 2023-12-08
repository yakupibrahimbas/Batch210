package d26exceptions;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        String []arr={"j","a","v","a","v"};
        //getElementFromArray(arr,1);
        getElementFromArray(arr,5);
    }
    public static void getElementFromArray(String [] s,int idx){
        try {
            String el=s[idx];
            System.out.println(el);
        } catch (Exception e) {
            System.out.println("index numarasi "+ (s.length-1) +"den buyuk olamaz");
        }
    }
}
