package d5incrementifswitch;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 5;
        a = a + 2;
        System.out.println(a);
        System.out.println("------------------------");
        a += 2;
        System.out.println(a);
        System.out.println("------------------------");
        int c=10;
        c=c-3;
        System.out.println(c);
        System.out.println("---------------------------");
        c-=4;
        System.out.println(c);
        System.out.println("---------------------------");
        int d=6;
        d=d*2;
        System.out.println(d);
        System.out.println("---------------------------");
        d*=2;
        System.out.println(d);
        System.out.println("---------------------------");
        int e =24;
        e=e/2;
        System.out.println(e);
        System.out.println("---------------------------");
        e/=2;
        System.out.println(e);
        System.out.println("---------------------------");
        int f=13;
        f=f+1;
        f++;
        System.out.println(f);
        System.out.println("---------------------------");
        int h =15;
        h=h-1;
        h-=1;
        h--;
        System.out.println(h);
        System.out.println("---------------------------");
        int i=10;
        int k=i++;
        System.out.println(k);
        System.out.println(i);
        System.out.println("---------------------------");
int m=15;
int n=++m;
        System.out.println(n);
        System.out.println(m);

        System.out.println("---------------------------");
int p=17;
int r=p--;
        System.out.println(p);
        System.out.println(r);

        System.out.println("---------------------------");
int s=20;
int t=--s;
        System.out.println(t);
        System.out.println(s);


    }

    public static class Switch01 {
        public static void main(String[] args) {
            String dayName = "wednesday";

            if (dayName.equalsIgnoreCase("Sunday")) {
                System.out.println("Birinci gun");

            } else if (dayName.equalsIgnoreCase("Monday")) {
                System.out.println("Ikinci gun");

            } else if (dayName.equalsIgnoreCase("Tueday")) {
                System.out.println("Ucuncu gun");

            } else if (dayName.equalsIgnoreCase("Wednesday")) {
                System.out.println("Dorduncu gun");

            } else if (dayName.equalsIgnoreCase("Thursday")) {
                System.out.println("Besinci gun");

            } else if (dayName.equalsIgnoreCase("Friday")) {
                System.out.println("Altinci gun");

            } else if (dayName.equalsIgnoreCase("Saturday")) {
                System.out.println("Yedinci gun");
            } else {
                System.out.println("Lutfen gecerli bir gun adi giriniz");

            }

            switch (dayName.toLowerCase()){
                case "Sunday":
                    System.out.println(1);
                    break;
                case "Monday":
                    System.out.println(2);
                    break;
                case "Tuesday":
                    System.out.println(3);
                    break;
                case "Wednesday":
                    System.out.println(4);
                    break;
                case "Thursday":
                    System.out.println(5);
                    break;
                case "Friday":
                    System.out.println(6);
                    break;
                case "Saturday":
                    System.out.println(7);
                    break;
                default:
                    System.out.println("Gecerli bir gun adi giriniz");

            }
            }

        }
}
