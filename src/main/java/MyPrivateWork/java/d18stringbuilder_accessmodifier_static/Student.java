package MyPrivateWork.java.d18stringbuilder_accessmodifier_static;

public class Student {
    /*
    1)public
    2)protected
    3)default
    4)private

    public > protected > default > private

    public      ==>  public olanlar her class'dan kullanilabilir
    protected   ==> protected olanlar baska package'lardan kullanilamaz, ancak baska package'larda child classlar icinden kullanilabilir
    default     ==> default olanlar baska package'lardan kullanilamazlar
    private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

    "protected ile default" arasindaki farki söyleyiniz?
    Not ==> protected olanlar baska package'lardan kullanilamaz ancak baska package'larda
    child classlar icinden kullanilabilir. default olanlar baska package'lardan kullanilamazlar
 */

    public String stdName="Ali Can";
    protected String adress="Istanbul";
    String email ="alican@gmail.com";
    private String tcKimlik="123456789";
}
