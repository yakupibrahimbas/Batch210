package Practice.Practice07;

public interface Muhasebe {

    /*
    calisan memur ise;
       1- Çalışanın aylık çalışma saatine göre 120 saat üstü  her saat için brüt maaşı 10 dolar artır.
       2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
       daha az ise maasindan %25 vergi kesintisi yapılıyor
 */
    double ekMesai(int calismaSaati);

    public abstract double ekmesai(int calismaSaati);

    double vergi(double brutMaas,int calismaYili);

}
