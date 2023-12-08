package d27exceptions_enum_iterators;

public class ExceptionRunner {
    public static void main(String[] args) {


    }//main dizisi

    public static void ogrenciNotu(int not){
        System.out.println(not);
        if (not<0||not>100){
            try {
                throw new InvalidStudentGradeException("Ogrenci notu 0'dan kucuk ve yuzden buyuk girilemez.");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(not);
        }
    }

}
