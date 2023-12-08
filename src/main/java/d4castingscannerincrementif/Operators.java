package d4castingscannerincrementif;

public class Operators {
    public static void main(String[] args) {

        //Logical operators
        // AND && isleminden true alabilmek icin hersey true olmalidir.(carpma)
        //OR-Veya (||) isleminde bir tane true sonucu true yapmaya yeterlidir.
        //Not-degil (!) true olani false , false olani true yapar.

        //!true=false
        //!false=true
        //!!true=true

        boolean a= 3<5 ;
        boolean b= 2+3 != 5;
        boolean c =2+3*5>=19;
        System.out.println(a && b);
        System.out.println(a || b || c);
        System.out.println(a || b);



    }


}
