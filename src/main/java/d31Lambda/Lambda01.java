package d31Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        /*Bir dosyadan(txt), harf harf degil de satir satir secme yapabilecegiz

        Ornek 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.

        a) lines,Files sınıfına ait bir metottur.Belirtilen bir dosya yolundan satır satır
        veri okumak için bir Stream<String> döndürür.Bu sayede dosyadaki her satır üzerinde
        akış işlemleri yapabilirsiniz.
        b) Paths.get, Paths sınıfının statik bir metodudur.
        Verilen dosya yolu dizgesini (string) temsil eden bir Path nesnesi döndürür.
        Bu Path nesnesi, dosya ve dizin işlemleri için kullanılır. (oralara ulasimi saglar)*/
        Files.lines(Paths.get("src/main/java/d31Lambda/lambdaTextFile.txt")).forEach(System.out::println);
        System.out.println("----------------");

        //Ornek 2: Verilen text file icindeki text’i buyuk harflerle console’a yazdiran kodu yaziniz.

        Files.lines(Paths.get("src/main/java/d31Lambda/lambdaTextFile.txt")).map(String::toUpperCase).
                forEach(System.out::println);
        System.out.println("****************************************************************");
        boolean result1=Files.lines(Paths.get("src/main/java/d31Lambda/lambdaTextFile.txt")).
                anyMatch(t->t.contains("Veli"));
        System.out.println("result1 = " + result1); //Ali yazsaydik true verirdi.

        System.out.println("**************************************************");

        //Ornek 4: Verilen text file icindeki text’lerde kullanilan farkli kelimeleri bir list icinde return ediniz.

        /*flatMap,Stream sınıfına ait bir metottur.
        Işlem sonucunda elde edilen tüm akışlar (streams) tek bir akışta (stream) birleştirilir.
        Özellikle iç içe geçmiş veri yapılarını düzleştirmek için kullanılır.
        flatMap'ten once split tum bosluklardan boldugu icin bize Array verir.Bu Array yapisini duzlestirerek
        bize tek bir akis verir*/
        List<String>words=Files.lines(Paths.get("src/main/java/d31Lambda/lambdaTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(words);

        System.out.println("-----------------");
        //Ornek 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.

        long numberOfLetters=Files.lines(Paths.get("src/main/java/d31Lambda/lambdaTextFile.txt")).
                map(t->t.replaceAll("^a-zA-Z","")).map(t->t.split("")).flatMap(Arrays::stream).count();
        System.out.println(numberOfLetters);
        System.out.println("---------------------------------");
        //Ornek 6: Verilen text file icindeki text’de kullanilan tum harfleri tekrarsiz olarak
        // natural order’da (a’dan z’ye) bir listin icinde return eden kodu yaziniz.
        List<String> words2 = Files.lines(Paths.get("src/main/java/d31lambda/lambdaTextFile.txt")).
                map(t->t.replaceAll("[\\p{Punct}\"]","").split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words2);



    }
}
