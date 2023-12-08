package MyPrivateWork;

public class Y99 {
    public static void main(String[] args) {

String []cities=new String[5];
cities[0]="Trabzon";
cities[1]="Rize";
cities[2]="Artvin";
cities[3]="Bayburt";
cities[4]="Gumushane";

int toplam=0;
        for (int i = 0; i < cities.length; i++) {
            toplam=toplam+cities[i].length();
        }
        System.out.println(toplam);

    }
}
