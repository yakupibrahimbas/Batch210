package d20oop;

public class Car extends Vehicle {
    public Car(){
        super();

        System.out.println("Sedan");

    }
    public Car(String tip){
        super("H",2023,"e");
        System.out.println("Sport");
    }
}
