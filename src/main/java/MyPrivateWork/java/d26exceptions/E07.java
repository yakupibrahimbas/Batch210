package MyPrivateWork.java.d26exceptions;

public class E07 {
    public static void main(String[] args) {
        //6) IllegalArgumentException,bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
        printAge(25);
        printAge(20);


    }

    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Yasi negatif girmeyiniz");

        }else {
            System.out.println(age);

        }
    }
}
